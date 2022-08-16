package test;

public class PalindromNumber {

	public static void main(String[] args) {
		
		int n=21012;
		int temp=n;
		int res=0,rem=0;
		while(n>0) {
			rem=n%10;
			res=(res*10)+rem;
			n=n/10;
		}
		if(temp==res) {
			System.out.println("Palindrom Number");
		}
		else {
			System.out.println("Not a Palindrom number");
		}

	}

}
