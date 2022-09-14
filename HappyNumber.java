package interview;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		int rem=1, sum=0;
		int num=n;
		while(num>9) {
			while(num>0) {
				rem=num%10;
				sum=sum+(rem*rem);
			    num=num/10;
			}
			num=sum;
			sum=0;
		}
		if(num==1) {
			System.out.println("Happy Number");
		}else {
			System.out.println("Not Happy Number");
		}
		

	}

}
