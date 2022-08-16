package test;

public class StringEx1 {

	public static void main(String[] args) {
		
		//aabbacd--->abcd-3211
		
		String s="aabbacd";
		char arr[]=s.toCharArray();
		
		String ans1=" ";
		String ans2=" ";
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			int count=0;
			for(int j=0; j<s.length(); j++) {
				if(c==arr[j]) {
					count++;
					arr[j]='\0';
				}
			}
			 if(count>0) {
			    ans1=ans1+c;
			    ans2=ans2+count;
			    }

		}
		System.out.println(ans1+" -"+ans2);
	   
	}

}
