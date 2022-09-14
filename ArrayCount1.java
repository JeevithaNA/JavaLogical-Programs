package interview;


import java.util.LinkedHashSet;

public class ArrayCount1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello hi welcome hi good bye hello";
		String arr[]=s.split(" ");
		
		LinkedHashSet l=new LinkedHashSet();
		for(String ele:arr) {
			l.add(ele);
		}
		System.out.println(l);
		for(Object ele1:l) {
			int count=0;
			for(String ele2:arr) {
				if(ele1.equals(ele2)) {
					count++;
				}
			}
			System.out.println(ele1+" "+count);
			count=0;
		}
	}

}
