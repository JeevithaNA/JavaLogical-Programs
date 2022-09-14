package interview;

public class Recursion1 {
	static void rec(int n) {
		if(n==5) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		rec(n+1);
	}

	public static void main(String[] args) {
		
        rec(1);
	}

}
//Print 1 to 5 number
