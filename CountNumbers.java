package interview;

public class CountNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12547;
		int count=0;
		int sum=0,rem=0;
		while(n!=0) {
			rem=n%10;
			if(rem%2!=0) {
			count++;
			sum+=rem;
		    }
			n=n/10;
		}
		System.out.println(sum);
		//System.out.println(n);

	}

}
