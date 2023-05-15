package exception;

public class Calculator {

	int a,b;
	Calculator(){
		
	}
	
	public  Calculator(int a , int b) {
		
		this.a = a;
		this.b = b;
	}

	
	public int add() {

		if (a<0 || b<0) {
			throw new ArithmeticException("Two numbers should be positive.");
		}
		return a+b;
	
	}
	
	public int Substract() {
		if (a<0 || b<0) {
			throw new ArithmeticException("Two numbers should be positive.");
		}
		return a-b;
	}
	
	public int multiply() {
		if (a==0 || b==0) {
			throw new ArithmeticException("Two numbers should not be zero.");
		}
		return a*b;
	}
	public double Division() {
		if (a==0 || b==0) {
			throw new ArithmeticException("Two numbers should not be zero.");
		}
		return (double) a/b;
	}
	
}
