package test;

import java.util.Scanner;

public class StringEx4 {

	public static void main(String[] args) {
		/* o/p-->hello143 @24 bye
                 14    */

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String s=sc.nextLine();
		sc.close();
		int sum=0;
		
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				int n=ch-48; 
				sum+=n;               // 1+4+3+2+4
			}
		}
		System.out.println(sum);

	}

}
