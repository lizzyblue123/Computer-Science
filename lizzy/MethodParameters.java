package lizzy;
import java.util.Scanner;

public class MethodParameters{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		TunaM TunaMObject = new TunaM ();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		TunaMObject.simpleMessage(name);
		
	}
}