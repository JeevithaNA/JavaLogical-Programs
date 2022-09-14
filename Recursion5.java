package interview;

import java.util.Scanner;

public class Recursion5 {
	static int sum=0;
	static void rec(int n) {
		if(n==10) {
			sum=sum+n;
			System.out.println(sum);
			return;
		}
		sum=sum+n;
		rec(n+2);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
         rec(n);
	}

}
