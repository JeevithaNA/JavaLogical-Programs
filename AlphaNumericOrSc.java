package test;

import java.util.Scanner;

public class AlphaNumericOrSc {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
		char c=sc.next().charAt(0);
		if(c>='a' && c<='z' || c>='A' && c<='Z') {
			System.out.println("Its a Alpha ");
		}
		else if(c>='0' && c<='9') {
			System.out.println("Its a Numeric");
		}
		else {
			System.out.println("Its a Special Character");
		}

	}

}
