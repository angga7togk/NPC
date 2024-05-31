package idk.plugin.npc;

import cn.nukkit.Server;
import cn.nukkit.entity.Entity;
import cn.nukkit.level.Level;
import cn.nukkit.utils.MainLogger;
import com.google.gson.Gson;
import idk.plugin.npc.models.AddressModel;
import idk.plugin.npc.models.query.QueryModel;

import javax.annotation.Nullable;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryTask implements Runnable {

    @Override
    public void run() {
        for (Level level: Server.getInstance().getLevels().values()){
            for (Entity entity: level.getEntities()){
               boolean isNPC = entity.namedTag.getBoolean("npc");
               if (isNPC){
                   String nameOld = entity.getName();
                   AddressModel address = extractIPAndPort(nameOld);
                   if (address != null){
                       QueryModel queryModel = getQuery(address);
                       String formated;
                       if(queryModel != null && queryModel.isOnline()){
                           formated = NPC.config.getString("query.format-online", "§aOnline: §b%online%§f/§e%max-online%")
                                   .replace("%online%", String.valueOf(queryModel.getPlayers().getOnline()))
                                   .replace("%max-online%", String.valueOf(queryModel.getPlayers().getMax()))
                                   .replace("%motd%", String.valueOf(queryModel.getMotd().toString()));
                       }else{
                           formated = NPC.config.getString("query.format-offline");
                       }
                       entity.setNameTag(nameOld.replace(address.getText(), formated));
                   }
               }
            }
        }
    }

    private @Nullable QueryModel getQuery(AddressModel address){
        String url = String.format("https://api.mcsrvstat.us/bedrock/3/%s:%s", address.getIp(), address.getPort());
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                Gson gson = new Gson();
                return gson.fromJson(response.body(), QueryModel.class);
            } else {
                MainLogger.getLogger().info("Failed to fetch data. Status code: " + response.statusCode());
            }
        } catch (Exception e) {
            MainLogger.getLogger().info("An error occurred: " + e.getMessage());
        }
        return null;
    }

    @Nullable
    public static AddressModel extractIPAndPort(String input) {
        Pattern pattern = Pattern.compile("%(.*?):(\\d+)%");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            String ip = matcher.group(1);
            int port = Integer.parseInt(matcher.group(2));
            String text = matcher.group();

            return new AddressModel(ip, port, text);
        } else {
            return null;
        }
    }


}
