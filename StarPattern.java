package test;

public class StarPattern {

	public static void main(String[] args) {
	     

		System.out.println("1------------------------");
 		/** * * * *  
          * * * * * 
          * * * * * 
          * * * * * 
          * * * * * */
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("2------------------------");

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

		System.out.println("3------------------------");

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}

		System.out.println("4------------------------");

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i<=j) {
					System.out.print("* ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

		System.out.println("5------------------------");

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i>=j) {
					System.out.print("* ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

		System.out.println("6------------------------");

		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j==n+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

		System.out.println("7------------------------");


		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j<=n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

		System.out.println("8------------------------");


		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j>=n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

		System.out.println("9------------------------");


		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j || i+j==n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

		System.out.println("10------------------------");


		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j || i+j==n+1) {
					System.out.print(" ");
				}
				else {
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("11------------------------");

		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j || i+j==n+1 || i<=j) {
					System.out.print("* ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("12------------------------");

		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j || i+j==n+1 || i>=j) {
					System.out.print("* ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("13------------------------");

		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j<=n+1 || i==j  ) {
					System.out.print("* ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		

	}

}
