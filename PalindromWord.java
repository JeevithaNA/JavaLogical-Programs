package test;

public class PalindromWord {

	public static void main(String[] args) {
		
		String s="NAN";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not a palindrom");
		}

	}

}
