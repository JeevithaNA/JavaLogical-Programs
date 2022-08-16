package test;

public class RemovingLastWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Combination";
		for(int i=s.length()-1; i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print(s.charAt(j));
			}
			System.out.println(" ");
		}

	}

}
