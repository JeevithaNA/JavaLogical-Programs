package interview;

import java.util.Scanner;

public class ArrayDynamicInput {

	public static void main(String[] args) {

		Scanner ip=new Scanner(System.in);
		System.out.println("enter the size of array : ");
		
		int size =ip.nextInt();
		System.out.println("enter the elements :");
		
		int arr1[]=new int[size];
		for(int i=0;i<=size-1;i++) {
			arr1[i]=ip.nextInt();
		}
		System.out.println("array elements are :");
		for(int ele:arr1) {
			System.out.print(ele+" ");
		}
		
	}

}
/*enter the size of array : 
3
enter the elements :
10
23
12
array elements are :
10 23 12 */
