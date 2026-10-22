package oper02;

public class Arithmatic01 {

	public static void main(String[] args) {
		
		int n1  =  3 + 4 * 2;
		System.out.println( n1 );
				
		System.out.println( 7 / 2    );
		System.out.println( 7 / 2.0  );
		
		System.out.println( 0 == 0.0 );
		
		int n2  =  0 / 3;
		System.out.println( n2 );  // 0
		
		// 예외처리 없을때
		// int n3  =  3 / 0;
		// System.out.println( n3 );
		 // Exception : 예외 ,  RuntimeError 실행시 발생 오류
		 // Exception in thread "main" java.lang.ArithmeticException: / by zero
		 //   at oper02.Arithmatic01.main(Arithmatic01.java:18)
		 // 이 후 프로그램은 종료되며 실행되지 않는다
		
		// 예외처리 되었을때
		try {
			int n3 = 3 / 0;
			System.out.println( n3 );
		} catch (ArithmeticException e) {
			System.out.println("계산 예외발생:" + e);
		} catch (Exception e) {
			System.out.println("예외발생:" + e);
			// ava.lang.ArithmeticException
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} finally {
			System.out.println("에외상관없이 무조건 출력된다");
		}

		System.out.println("메롱 ~~~~~~~~~~~~~~~");
		
	}

}





