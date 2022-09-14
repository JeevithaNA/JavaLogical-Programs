package interview;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1---------------------");
		
		int n=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
			
		}
		System.out.println("2---------------------");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(n%2==0) {
					System.out.print(1+" ");
				}else {
					System.out.print(0+" ");
				}
				n++;
			}
			System.out.println();
			
		}
		System.out.println("3----------------------");
		
		for(int i=0;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"");
			}
			System.out.println();
		}
		

	}

}
