package test;

import java.util.ArrayList;

public class StringToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello Jeevitha 143 Gv";
		String s1=" ";
		
		ArrayList l1=new ArrayList();
		for(int i=0;i<s.length()-1;i++) {
			char ch=s.charAt(i);
			if(ch==' ') {
				l1.add(s1);
				s1=" ";
			}else {
				s1+=ch;
			}
		}
		
		l1.add(s1);
		System.out.println(l1);
		System.out.println(l1.size());

	}

}
