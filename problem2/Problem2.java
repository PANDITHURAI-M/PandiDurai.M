package problem2;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value (a) :");
		int input = scanner.nextInt();
		printNumbers(input);
	}
	
	public static void printNumbers(int a) {
		int number =1;
		for(int i =1;i<a;i++) {
			System.out.print(number+",");
			number+=2;
		}
		System.out.print(number+" ");
	}
}
