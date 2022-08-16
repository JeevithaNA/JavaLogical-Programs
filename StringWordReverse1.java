package test;

import java.util.Scanner;

public class StringWordReverse1 {

	public static void main(String[] args) {
		
		/* o/p==>String Word Reverse
                 esreveR droW gnirtS */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String s=sc.nextLine();
		sc.close();
		String arr[]=s.split(" ");
		
		for(int i=arr.length-1; i>=0; i--) {
			String s1=arr[i];
			String rev=" ";
			for(int j=s1.length()-1; j>=0; j--) {
				rev=rev+s1.charAt(j);
			}
			System.out.print(rev);
		}

	}

}
