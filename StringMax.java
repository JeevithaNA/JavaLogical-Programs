package test;

public class StringMax {

	public static void main(String[] args) {
		
		String s="Hello This is Jeevitha";
		String arr[]=s.split(" ");
		int max=arr.length;
		String s1=arr[0];
		for(String ele:arr) {
			if(max<ele.length()) {
				max=ele.length();
				s1=ele;
			}
		}
		System.out.println(s1);

	}

}
