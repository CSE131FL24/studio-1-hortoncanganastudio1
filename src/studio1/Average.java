package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// TODO Auto-generated method stub
		System.out.println("The first of two integers to be averaged"); 
		int n1= in.nextInt();
		System.out.println("Value for First numbrt?");
		int x = in.nextInt();
		System.out.println("Value for second number?");
		int y = in.nextInt();
		
		System.out.println ((x+y)/2.0d );


	}

}
