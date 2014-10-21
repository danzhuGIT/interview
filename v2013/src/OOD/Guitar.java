package OOD;

public class Guitar {
	private Type type;
	private String serialNum;
	
	public Guitar(String s, Type t){
		this.serialNum=s;
		this.type=t;
	}
	
	public String getSerialNum(){
		return serialNum;
	}
	
	public Type getType(){
		return type;
	}

}
