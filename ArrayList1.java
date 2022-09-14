package interview;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {2,4,6,8,10};
		int arr2[]= {1,3,5,7,9,11,44};
		
		ArrayList l=new ArrayList();
		int size=arr1.length;
		if(size>=arr2.length) {
			size=arr2.length;
		}
		for(int i=0;i<size;i++) {
			l.add(arr1[i]);
			l.add(arr2[i]);
		
		}
		if(arr1.length>arr2.length) {
		   for(int i=size;i<arr1.length;i++) {
			   l.add(arr1[i]);
		   }
		}else {
			for(int i=size;i<arr2.length;i++) {
				   l.add(arr2[i]);
			}
		}
		for(Object ele:l) {
			System.out.print(ele+" ");
		}

	}

}
