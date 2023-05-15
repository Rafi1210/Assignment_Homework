package practice;

class LowBalanceException extends Exception{
	public String toString() {
		return "Something";
	}
}

public class exception_test {

	static void fun1() {
		try {
			throw new LowBalanceException();
		} catch (LowBalanceException e) {

			System.out.println(e);		}
	}
	static void fun2() {
		fun1();
	}
	static void fun3() {
		fun2();
	}
	
	public static void main(String[] args) {

		 int A[]={30,20,10,40,0};
	        
	        try
	        {
	            int c=A[0]/A[4];
	            System.out.println("Division is "+c);
	        }
	        catch(ArithmeticException e)
	        {
	            System.out.println("Denominator should not be 0");
	        }
	        try {
	        	  System.out.println(A[5]);
	        }
	        catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Index is Invalid");
            }
	        
	        System.out.println("Bye");
	        fun3();
	}

}
