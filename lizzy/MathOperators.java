package lizzy;

import java.util.Scanner;

public class MathOperators {
	public static void main(String args[]){
		Scanner liz = new Scanner(System.in);
		
		int girls, boys, people;
		girls = 7;
		boys = 3;
		people = girls % boys;
		System.out.println(people);
	}
}

