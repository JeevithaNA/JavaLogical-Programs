package test;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,54,36,7,8,98,22,99,77,45,65,66};
		ArrayList<Integer> l1=new ArrayList<Integer>();
		for(int ele:arr) {
			if(ele%2==0) {
				l1.add(ele);
			}
		}
		Collections.sort(l1);
		System.out.println(l1);
		int n=l1.size()-3;
		System.out.println(l1.get(n));

	}

}
