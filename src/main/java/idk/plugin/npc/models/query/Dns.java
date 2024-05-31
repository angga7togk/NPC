package idk.plugin.npc.models.query;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Dns{

	@SerializedName("a")
	private List<AItem> A;

	public List<AItem> getA(){
		return A;
	}
}