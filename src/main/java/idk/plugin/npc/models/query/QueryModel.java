package idk.plugin.npc.models.query;

import com.google.gson.annotations.SerializedName;

public class QueryModel{

	@SerializedName("motd")
	private Motd motd;

	@SerializedName("protocol")
	private Protocol protocol;

	@SerializedName("hostname")
	private String hostname;

	@SerializedName("debug")
	private Debug debug;

	@SerializedName("software")
	private String software;

	@SerializedName("port")
	private int port;

	@SerializedName("players")
	private Players players;

	@SerializedName("ip")
	private String ip;

	@SerializedName("online")
	private boolean online;

	@SerializedName("version")
	private String version;

	@SerializedName("gamemode")
	private String gamemode;

	@SerializedName("serverid")
	private String serverid;

	public Motd getMotd(){
		return motd;
	}

	public Protocol getProtocol(){
		return protocol;
	}

	public String getHostname(){
		return hostname;
	}

	public Debug getDebug(){
		return debug;
	}

	public String getSoftware(){
		return software;
	}

	public int getPort(){
		return port;
	}

	public Players getPlayers(){
		return players;
	}

	public String getIp(){
		return ip;
	}

	public boolean isOnline(){
		return online;
	}

	public String getVersion(){
		return version;
	}

	public String getGamemode(){
		return gamemode;
	}

	public String getServerid(){
		return serverid;
	}
}