package interview;

public class Recursion2 {
	static void rec(int n) {
		if(n==10) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		rec(n+2);
	}

	public static void main(String[] args) {
		rec(2);

	}

}

/*print Odd number 1 to 10:
 * -----------------------
 
static void rec(int n) {
	if(n==9) {
		System.out.println(n);
		return;
	}
	System.out.println(n);
	rec(n+2);
}

public static void main(String[] args) {
	rec(1);

}*/