package interview;

public class PerfectSquareNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=9;
		int flag=0;
		for(int i=1;i<=n;i++) {
			if(i*i==n) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Perfect");
		}else {
			System.out.println("Not Perfect");
		}

	}

}
