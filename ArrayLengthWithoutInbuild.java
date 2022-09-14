package interview;

public class ArrayLengthWithoutInbuild {

	public static void main(String[] args) {
		// Size of the given array is:5
		
		int arr[]= {10,20,30,40,50};
		int length=0;
		for(int ele:arr) {
			length++;
		}
		System.out.println("Size of the given array is:"+length);

	}

}
