package interview;

import java.util.Scanner;

public class HappyNumberUsingMethod {
	
	static int happyNumber(int n) {
		int rem=1,sum=0;
		while(n!=0) {
			rem=n%10;
			sum=sum+(rem*rem);
			n=n/10;
		}
		return sum;
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		while(n!=1 && n!=4) {
			n=happyNumber(n);
		}
		if(n==1) {
			System.out.println("Happy Number");
		}else {
			System.out.println("Not Happy number");
		}

	}

}
