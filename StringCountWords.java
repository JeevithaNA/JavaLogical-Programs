package test;

import java.util.Scanner;

public class StringCountWords {

	public static void main(String[] args) {
		/* Count number of words in given String.
		hello this is janu
		Number of words in given String is: 4*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String;");
		String s=sc.nextLine();
		sc.close();
		int count=0;
		
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
		    if(ch==' ') {
		    	count++;
		    }
		}
		//count+=1;
		System.out.println("Number of words in given String is: " +count);
	}

}
