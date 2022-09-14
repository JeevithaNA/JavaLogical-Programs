package interview;

public class MatrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{4,3,5},{2,6,1},{7,9,8}};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr.length;i++) {
		sum1+=arr[i][i];
		sum2+=arr[i][arr.length-i-1];
		
		}
		System.out.println(sum1+" "+sum2);
	}

}
