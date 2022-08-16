package test;

public class ArraySort {

	public static void main(String[] args) {

		int[] a= {4,5,3,6,2,7,1,8,9,10};
		int temp=0;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("3rd minimum:"+a[3-1]);
		System.out.println("3rd maximum:"+a[a.length-3]);

	}
}
