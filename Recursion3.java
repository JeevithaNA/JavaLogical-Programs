package interview;

public class Recursion3 {
	static void rec(int n) {
		if(n==0) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		rec(n-1);
		System.out.println(n);
	
	}
	
	public static void main(String[] args) {
		rec(3);
		

	}

}
