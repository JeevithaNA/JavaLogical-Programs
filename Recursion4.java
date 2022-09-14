package interview;

public class Recursion4 {
	static int fact=1;
	static void rec(int n) {
		if(n==1) {
			fact=fact*n;
			System.out.println(fact);
			return ;
		}
		fact=fact*n;
		rec(n-1);
	}

	public static void main(String[] args) {
		rec(5);

	}

}
