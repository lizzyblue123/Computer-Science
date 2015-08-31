package lizzy;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]){
		Scanner liz = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first num: ");
		fnum = liz.nextDouble();
		System.out.println("Enter second num: ");
		snum = liz.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}
}

