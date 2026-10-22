package oper01;

public class OperTest01 {

	public static void main(String[] args) {
		
		// 설명 : 실행되지 않는 문장 : Comment, Remark : //, /* */
		// n1++ == n1 = n1 + 1
		
		int  n1  = 3;
		int  n2  = 0;
		
		//System.out.println("n1=" + n1 + ",n2=" + n2);
		// 1.
		// n2  =  n1++;   // 4, 3
		// n2  =  n1 ;
		// n1  =  n1 + 1;
		
		// 2.
	    // n2 = ++n1;	      // 4, 4   
		n1  = n1 + 1;
		n2  = n1;
		System.out.println("n1=" + n1 + ",n2=" + n2);
		
		

	}

}








