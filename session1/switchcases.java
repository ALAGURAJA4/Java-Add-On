package session1;

import java.util.Scanner;

public class switchcases {
	public static void main(String[]args)
	{
	System.out.println("Select your language");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your choice(1/2/3/4):");
	int ch = sc.nextInt();
	switch(ch)
	{
	case 1: System.out.println("tamil");
	break;
	
	case 2:System.out.println("English");
	break;
	
	case 3:System.out.println("Telugu");
	break;
	
	case 4:System.out.println("Kannada");
	break;
	
	default:
		System.out.println("Invalid Choice");
	}
	}

}
