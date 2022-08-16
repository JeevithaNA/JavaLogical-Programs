package test;

import java.util.Scanner;

public class StringWordReverse {

	public static void main(String[] args) {
	    
		/*  o/p-->jeevi hi ji
                  iveej ih ij */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String s=sc.nextLine();
		String arr[]=s.split(" ");
		for(String ele:arr) {
			String rev=" ";
			for(int i=ele.length()-1; i>=0; i--) {
				rev=rev+ele.charAt(i);
			}
			System.out.print(rev);
		}
	
	}

}
