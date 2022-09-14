package interview;

public class CountRepeatWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Jeevitha Gv jeevi Jeevitha Sushma Diwaker Sushma";
		String arr1[]=s.split(" ");
		String arr2[]=s.split(" ");
		
		for(int i=0;i<arr1.length;i++) {
			int count=0;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i].equals(arr2[j])) {
					count++;
					arr2[j]="";
				}
			}
			if(count>0) {
				System.out.println(arr1[i]+"-"+count);
			
			}
		
		}

	}

}
