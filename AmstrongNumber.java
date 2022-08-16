package test;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		int n1=153,n2=n1,n3=n1,c=0;
		while(n2!=0) {
			c++;
			n2=n2/10;
		}
		int sum=0,rem=0;
		while(n3!=0) {
			rem=n3%10;
			int power=1;
			for(int i=1;i<=c;i++) {
				power*=rem;
			}
		   sum+=power;
		   n3=n3/10;
		}
		if(sum==n1) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not a armstrong number");
		}

	}

}
