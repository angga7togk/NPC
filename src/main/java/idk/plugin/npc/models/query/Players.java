package idk.plugin.npc.models.query;

import com.google.gson.annotations.SerializedName;

public class Players{

	@SerializedName("max")
	private int max;

	@SerializedName("online")
	private int online;

	public int getMax(){
		return max;
	}

	public int getOnline(){
		return online;
	}
}