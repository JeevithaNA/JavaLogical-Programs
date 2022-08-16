package test;

public class StringEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello 200 hi 500 Good 300";
	    String s1=" ";
	    char ch;
	    int sum=0;
	    int n;
	    
	    for(int i=0; i<s.length(); i++) {
	    	ch=s.charAt(i);
	    	if(ch==' ') {
	    		if(s1.charAt(0)>='0' && s1.charAt(0)<='9') {
	    			n=Integer.parseInt(s1);
	    			sum=sum+n;
	    		}
	    		s1="";
	    	}else {
	    		s1+=ch;
	    	}
	    }
	    if(s1.charAt(0)>='0' && s1.charAt(0)<='9') {
	    	n=Integer.parseInt(s1);
	    	sum+=n;
	    }
	    System.out.println(sum);

	}

}
