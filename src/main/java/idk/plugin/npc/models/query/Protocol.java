package idk.plugin.npc.models.query;

import com.google.gson.annotations.SerializedName;

public class Protocol{

	@SerializedName("name")
	private String name;

	@SerializedName("version")
	private int version;

	public String getName(){
		return name;
	}

	public int getVersion(){
		return version;
	}
}