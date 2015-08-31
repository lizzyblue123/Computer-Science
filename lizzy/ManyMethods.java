package lizzy;
import java.util.Scanner;

public class ManyMethods{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		TunaMM TunaMMObject = new TunaMM();
		System.out.println("Enter name of first gf here: ");
		String temp = input.nextLine();
		TunaMMObject.setName(temp);
		TunaMMObject.saying();
		
	}
}