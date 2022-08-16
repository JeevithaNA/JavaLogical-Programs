package test;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> l1=new ArrayList<Object>();
		l1.add("Hello");
		l1.add(10);
		l1.add("Gv");
		l1.add("Welcome");
		System.out.println(l1);
		
		ArrayList<Object> l2=new ArrayList<Object>();
		l2.add(10);
		l2.add("Welcome");
		l2.add(90);
		l2.add(30);
		System.out.println(l2);
		
		ArrayList<Object> l3=new ArrayList<Object>();
		for(Object obj:l1) {
			if(l2.contains(obj)) {
				l3.add(obj);
			}
		}
		for(Object obj:l3) {
			l1.remove(obj);
			l2.remove(obj);
		}
		
		l1.addAll(l2);
		System.out.println(l1);

	}

}
