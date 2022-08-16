package test;

public class StringEx3 {

	public static void main(String[] args) {
		// MAXMIMUM----v:5
		
		String s="abbsvvvvvsdfgh";
		char arr[]=s.toCharArray();
		int max=0;
		char ans=' ';
		
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			int c=0;
			for(int j=0; j<s.length(); j++) {
				if(ch==arr[j]) {
					c++;
					arr[j]='\0';
				}
			}
			if(max<c) {
				max=c;
				ans=ch;
			}
		}
		System.out.println(ans+": "+max);

	}

}
