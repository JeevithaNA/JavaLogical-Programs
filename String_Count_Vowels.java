package interview;

public class String_Count_Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="WELCome";
		String s1=s.toLowerCase();
		int count=0;
		for(int i=0; i<=s1.length()-1;i++) {
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u') {
				count++;
			}
			
		}
		System.out.println("Total Number of Vowels: "+count);
        //char a='A';
        //char b='B';
        //System.out.println(""+a+b);
	}

}
//Total Number of Vowels: 3
//AB