package idk.plugin.npc.models.query;

import com.google.gson.annotations.SerializedName;

public class Debug{

	@SerializedName("cachetime")
	private int cachetime;

	@SerializedName("querymismatch")
	private boolean querymismatch;

	@SerializedName("ipinsrv")
	private boolean ipinsrv;

	@SerializedName("cacheexpire")
	private int cacheexpire;

	@SerializedName("ping")
	private boolean ping;

	@SerializedName("srv")
	private boolean srv;

	@SerializedName("query")
	private boolean query;

	@SerializedName("cnameinsrv")
	private boolean cnameinsrv;

	@SerializedName("cachehit")
	private boolean cachehit;

	@SerializedName("dns")
	private Dns dns;

	@SerializedName("apiversion")
	private int apiversion;

	@SerializedName("animatedmotd")
	private boolean animatedmotd;

	public int getCachetime(){
		return cachetime;
	}

	public boolean isQuerymismatch(){
		return querymismatch;
	}

	public boolean isIpinsrv(){
		return ipinsrv;
	}

	public int getCacheexpire(){
		return cacheexpire;
	}

	public boolean isPing(){
		return ping;
	}

	public boolean isSrv(){
		return srv;
	}

	public boolean isQuery(){
		return query;
	}

	public boolean isCnameinsrv(){
		return cnameinsrv;
	}

	public boolean isCachehit(){
		return cachehit;
	}

	public Dns getDns(){
		return dns;
	}

	public int getApiversion(){
		return apiversion;
	}

	public boolean isAnimatedmotd(){
		return animatedmotd;
	}
}