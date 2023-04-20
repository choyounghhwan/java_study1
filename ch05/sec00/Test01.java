package ch05.sec00;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 3;
		int j = 5;
		char t ='+';
		String pandan = "";
		int result = calculate(i, j, t);
		
		if (t== '+')
			pandan="덧셈";
          System.out.println("두 수의 덧셈의 결과: " + result);
		else if (t=='-') 
			pandan="뺄셈";
		  System.out.println("두 수의 뺄셈의 결과: " + result);
		else if (t=='*') 
			pandan="곱셈";
		else
			pandan="나눗셈";
			
			  System.out.println("두 수의 " +pandan+ "의 결과 " : "+ result);
			
	}
	    static int calculate (int a, int b, char c) {
	    	
	    	switch(c) {
	    	
	    	case '+' :
	    		return a+b;		
	    	case '-' :
	    		return a-b;	
	    	case '*' :
	    		return a/b;	
	    	case '/' :
	    		return a/b;	
	    	default :
	    		return 0;
	    		    		
	    	}
			
	}
}