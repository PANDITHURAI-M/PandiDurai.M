package problem3;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean stop = true;
		while(stop) {
		System.out.print("Enter the value (a) :");
		int input = scanner.nextInt();
		printNumbers(input);
		System.out.println("\n do you want to stop executing : press y");
		String s = scanner.nextLine();
		stop = s.equalsIgnoreCase("y")?false :true;
		}
		scanner.close();
	}
	
	public static void printNumbers(int a) {
		int number =1;
		//trick for computing (odd,even)
		int criteria =(a%2==0 ? 1:0);
		int times =a - criteria +1;
		for(int i =1;i<times;i++) {
			System.out.print(number);
			if(i<times-1) {
				System.out.print(",");
			}
			number+=2;
		}

	}
}
