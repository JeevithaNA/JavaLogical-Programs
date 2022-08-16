package test;

public class StringWithNoSpace {

	public static void main(String[] args) {
		
		String s="hello hi Jeevi       welcome";
		String s1="";
		
		for(int i=0; i<=s.length()-1; i++) {
			if(s.charAt(i)!=0) {
				s1+=s.charAt(i);
			}
		}
		System.out.println(s1);
	}

}
