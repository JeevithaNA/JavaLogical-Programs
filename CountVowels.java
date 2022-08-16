package test;

public class CountVowels {

	public static void main(String[] args) {
		
		String s="I love you";
		char arr[]=s.toCharArray();
		int count=0;
		int space=0;
		int constraints=0;
		
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				count++;
				arr[i]=c;
				System.out.print(arr[i]);
			}
			else if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
				count++;
				arr[i]=c;
				System.out.print(arr[i]);
			}
			else if(c==' ') {
				space++;
			}
			else {
				constraints++;
			}
		}
		System.out.println();
		System.out.println("Number of Vowels:"+count);
		System.out.println("Number of Space:"+space);
		System.out.println("Number of Constraints:"+constraints);

	}

}
