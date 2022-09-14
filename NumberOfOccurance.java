package interview;

public class NumberOfOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,15,10,50,15};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
			if(arr[i]==arr[j]) {
				count++;
				System.out.println(arr[i]+" ");
			}
		  }
		}
		System.out.println("Occurance:::"+count);

	}

}
