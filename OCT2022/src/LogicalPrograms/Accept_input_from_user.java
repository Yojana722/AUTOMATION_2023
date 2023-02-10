package LogicalPrograms;

import java.util.Scanner;

public class Accept_input_from_user {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2:");
		int num2 = sc.nextInt();
		
		System.out.println(num1+num2);
	}
}
