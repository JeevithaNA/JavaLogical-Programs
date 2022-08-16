package test;

import java.util.Scanner;

public class StringUpperToLower {

	public static void main(String[] args) {
		
		// hello BYE-----HELLO bye
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String s=sc.nextLine();
		String s1=" ";
		sc.close();
		
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z') {
				ch-=32;
				s1+=ch;
			}
			else if(ch>='A' && ch<='Z') {
				ch+=32;
				s1+=ch;
			}
			else {
				s1+=ch;
			}
		}
		System.out.println(s1);

	}

}
