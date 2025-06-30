package problem1;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter first number (a) :");
	double a =scanner.nextDouble();
	System.out.print("Enter first number (b) :");
	double b = scanner.nextDouble();
	scanner.nextLine();
	System.out.println("Enter operation (add , subtract , multiply , divide ) :");
	String operation = scanner.nextLine();
	
	Calculator calculator = new Calculator(a, b, operation);
	calculator.calculate();
	
	}
	
	
	
	
}
