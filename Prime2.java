package test;

public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
			System.out.println(i);
			count++;
			}
			
		}
		System.out.println("Number of Factors:"+count);
		if(count==2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}

	}

}
