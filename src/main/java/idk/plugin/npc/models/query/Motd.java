package idk.plugin.npc.models.query;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Motd{

	@SerializedName("raw")
	private List<String> raw;

	@SerializedName("html")
	private List<String> html;

	@SerializedName("clean")
	private List<String> clean;

	public List<String> getRaw(){
		return raw;
	}

	public List<String> getHtml(){
		return html;
	}

	public List<String> getClean(){
		return clean;
	}
}