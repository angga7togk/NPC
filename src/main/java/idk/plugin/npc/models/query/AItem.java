package idk.plugin.npc.models.query;

import com.google.gson.annotations.SerializedName;

public class AItem{

	@SerializedName("address")
	private String address;

	@SerializedName("name")
	private String name;

	@SerializedName("rdata")
	private String rdata;

	@SerializedName("rdlength")
	private int rdlength;

	@SerializedName("type")
	private String type;

	@SerializedName("class")
	private String jsonMemberClass;

	@SerializedName("ttl")
	private int ttl;

	public String getAddress(){
		return address;
	}

	public String getName(){
		return name;
	}

	public String getRdata(){
		return rdata;
	}

	public int getRdlength(){
		return rdlength;
	}

	public String getType(){
		return type;
	}

	public String getJsonMemberClass(){
		return jsonMemberClass;
	}

	public int getTtl(){
		return ttl;
	}
}