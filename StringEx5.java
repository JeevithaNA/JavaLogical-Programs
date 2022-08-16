package test;

public class StringEx5 {

	public static void main(String[] args) {
		/* 
		 * sum from 0 to 48
		 * s="0475"
		 * sum=s.charAt(0)-48
		 * sum='0'-48
		 * sum=48-48
		 * sum=s.charAt(1)-48
		 * sum='4'-48
		 * sum=52-48
		 * */
		
		String s="143";
		int sum=0;
		int n=0;
		for(int i=0; i<s.length(); i++) {
			n=s.charAt(i)-48;
			sum+=n;
		}
		System.out.println("Sum of given String is:"+sum);

	}

}
