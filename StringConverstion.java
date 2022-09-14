package interview;

public class StringConverstion {

	public static void main(String[] args) {
		// UPPER TO LOWER CASE
		String s1="HELLO";
		String s2="";
		for(int i=0;i<=s1.length()-1;i++) {
			char v=s1.charAt(i);
			v=(char)(v+32);
			s2+=v;
		}
		System.out.println(s2);
		
		System.out.println("-----------------");
		//LOWER TO UPPER CASE
		
		String s3="jeevitha";
		String s4="";
		for(int j=0;j<=s3.length()-1;j++) {
			char v=s3.charAt(j);
			v=(char)(v-32);
			s4+=v;
		}
		System.out.println(s4);

	}

}
