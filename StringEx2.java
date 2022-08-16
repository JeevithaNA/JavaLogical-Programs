package test;

public class StringEx2 {

	public static void main(String[] args) {
		/* o/p:- a-3
		         b-2
		         c-1
		         d-1*/
		
		String s="aabbacd";
		char arr[]=s.toCharArray();
		
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			int count=0;
			for(int j=0; j<s.length(); j++) {
				if(ch==arr[j]) {
					count++;
					arr[j]='\0';
				}
			}
			if(count>0) {
				System.out.println(ch+" -"+count);
			}
		}
		
		

	}

}
