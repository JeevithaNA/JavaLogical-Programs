package test;

public class StringSpaceCount {

	public static void main(String[] args) {
		
		String s="Hello This is Jeevitha";
		int space=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				space++;
			}
		}
		System.out.println("The space count is:" +space);

	}

}
