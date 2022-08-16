package test;

public class NumberPattern {

	public static void main(String[] args) {
		
		System.out.println("1..==========================");
		/*1 1 1 1 1 
          2 2 2 2 2 
          3 3 3 3 3 
          4 4 4 4 4 
          5 5 5 5 5 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("2..----------------------------");
		/*11 12 13 14 15 
          21 22 23 24 25 
          31 32 33 34 35 
          41 42 43 44 45 
          51 52 53 54 55 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
		
		System.out.println("3..----------------------------");
		/*1 - - - - 
          - 2 - - - 
          - - 3 - - 
          - - - 4 - 
          - - - - 5 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j) {
					System.out.print(j+" ");
				}else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("4..--------------------------");
		/*- - - - 5 
          - - - 4 - 
          - - 3 - - 
          - 2 - - - 
          1 - - - - */
		
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j==n+1) {
					System.out.print(j+" ");
				}else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("5..---------------------------");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i>=j) {
					System.out.print(j+" ");
				}else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
         System.out.println("6..---------------------------");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i<=j) {
					System.out.print(i+" ");
				}else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("7..-----------------------------");
		
		int n1=5;
		for(int i=1; i<=n1; i++) {
			for(int j=1; j<=n1; j++) {
				if(i+j<=n1+1) {
					System.out.print(j+" ");
				}else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
      System.out.println("8..-----------------------------");
		
		int n2=5;
		for(int i=1; i<=n2; i++) {
			for(int j=1; j<=n2; j++) {
				if(i+j>=n2+1) {
					System.out.print(j+" ");
				}else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("9..---------------------------------");
		//2-1-4-3-6-5-8-7-10-9-
		
		for(int i=2; i<=10; i+=2) {
			//System.out.print(i-1);
			System.out.print(i+" "+(i-1)+" ");
		}
		
		System.out.println();
		System.out.println("10..-----------------------------------");
		
		//1 2 4 7 11 16 22 29 37 46
		int sum=1;
		for(int i=0; i<10; i++) {
			//System.out.print(sum+" ");
			sum=sum+i;
			System.out.print(sum+" ");
		}
		
		System.out.println();
		System.out.println("11..---------------------------------");
		
		


	}

}
