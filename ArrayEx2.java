package test;

import java.util.ArrayList;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,34,54,0,4,0,12};
	    ArrayList<Integer> l1=new ArrayList<Integer>();
		ArrayList<Integer> l2=new ArrayList<Integer>();
		for(int ele:arr) {
			if(ele==0) {
				l1.add(ele);
				
			}
			else {
				l2.add(ele);
			}
		}
		l2.addAll(l1);
		System.out.println(l2);
			
		

	}

}
