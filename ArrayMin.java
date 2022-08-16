package test;

public class ArrayMin {

	public static void main(String[] args) {
		
		int[] arr= {3,5,2,1,7,6,9};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);

		

	}

}
