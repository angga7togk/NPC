package idk.plugin.npc.models;

public class AddressModel{
	private final int port;
	private final String ip;
	private final String text;

	public AddressModel(String ip, int port, String textInput){
		this.ip = ip;
		this.port = port;
		this.text = textInput;
	}


	public int getPort(){
		return port;
	}

	public String getIp(){
		return ip;
	}
	public String getText() {return text;}
}
