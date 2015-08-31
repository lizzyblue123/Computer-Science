package lizzy;

public class TunaMM {
	private String girlname;
	public void setName(String name){
		girlname=name;
	}
	public String getName(){
		return girlname;
	}
	public void saying(){
		System.out.printf("your first gf was %s", getName());
	}
}
