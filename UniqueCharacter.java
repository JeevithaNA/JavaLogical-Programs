package test;

class UniqueCharacter {

	static int getUniqueCharacter(String s) {
		char arr[]=s.toCharArray();
		char ans=' ';
		String result=" ";

		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			int c=0;
			for(int j=0; j<s.length(); j++) {
				if(ch==arr[j]) {
					c++;
				}
			}
		

			if(c==1) {
				ans=ch;
				result=result+ans;
			}
		}
		System.out.println(result);
		return ans;
	}

	public static void main(String[] args) {
		
		
		getUniqueCharacter("statistics");

	}

}
