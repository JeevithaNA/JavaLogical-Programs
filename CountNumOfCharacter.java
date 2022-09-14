package interview;

public class CountNumOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Jeevitha";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch!=' ') {
				count++;
			}
		}
		   
		System.out.println("Total Number of character is::"+count);

	}

}
