package interview;

import java.util.Scanner;

public class ArrayNumbersToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		String s="";
		int rem=0;
		while(n!=0) {
			rem=n%10;
			s=arr[rem]+s;
			n=n/10;
		}
		System.out.println(s);
		

	}

}
