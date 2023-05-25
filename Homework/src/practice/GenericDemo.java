package practice;

class A{}
class B extends A{}
class C extends B{}

class MyArray<T>{ 
	 T A[] = (T[]) new Object[10];
	 int length = 0;
	 

	 public void append(T v){

		 A[length++] = v;
	 	}
	 public void display() {
		 for (int i = 0; i <length; i++) {
			System.out.println(A[i]);
		}
	 }
}


public class GenericDemo {
	static  void fun(MyArray<? super B> obj) {

		obj.display();
	}

	public static void main(String[] args) {

		MyArray<B> ma = new MyArray<>();
		
		MyArray<A> ma1 = new MyArray<>();
		fun(ma1);
		fun(ma);
	
	} 

}
