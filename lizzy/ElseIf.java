package lizzy;

public class ElseIf{
	public static void main(String args[]){
		int age = 37;
		
		if (age > 60)
			System.out.println("you are a senior citizen");
		else if (age >= 50)
			System.out.println("You are in your 50s");
		else if (age >= 40)
			System.out.println("You are in your 40s");
		else
			System.out.println("You are young");
		
	}
}