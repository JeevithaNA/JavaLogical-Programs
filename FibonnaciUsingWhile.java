package interview;

public class FibonnaciUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,sum=0;
		while(n1<=10) {
			System.out.print(n1+"");
			sum=n1+n2;
			n1=n2;
			n2=sum;
			
		}

	}

}
