package lizzy;

public class TunaC {
	private String girlname;
	
	public TunaC(String name){
		girlname=name;
	}
	
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
