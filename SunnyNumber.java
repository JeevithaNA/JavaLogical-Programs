package test;

public class SunnyNumber {
	static String sunnyNum(int s) {
		int n=s+1;
		for(int i=1;i<=n/2;i++) {
			if(i*i==n) {
				return "its a sunny number";
			}
		}
		return "Its not a sunny number";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sunnyNum(16));

	}

}
