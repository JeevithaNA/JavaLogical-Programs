package test;

public class StarPattern1 {

	public static void main(String[] args) {
		
		System.out.println("1.----------------------");
		int n=5;
		for(int i=0; i<=n; i++) {
			for(int j=0; j<n*2; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("2.---------------------");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j || j+i==2*n) {
					System.out.print(" ");
				}else {
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}

	}

}
