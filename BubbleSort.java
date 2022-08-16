package test;

public class BubbleSort {
	
	static void bubbleSort(int arr[]) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1; j<(arr.length-i); j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,5,3,4,1,6,8,7};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		bubbleSort(arr);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
