package mid_2;


import java.util.Scanner;

//class Account
//{
//    private String accNo;
//    private String name;
//    private String address;
//    private String phno;
//    private String dob;
//    protected long balance;
//    
//    public Account(String acc,String n,String add,String phno,String dob)
//    {
//        accNo=acc;
//        name=n;
//        address=add;
//        this.phno=phno;
//        this.dob=dob;
//        balance=0;
//    }
//    public void display() {
//    	System.out.println("Account No : "+getAccNo()+ "\nAccount Name : "+getName()+
//    			"\nAddress : "+getAddress()+"\nPhone No : "+getPhno()+"\nDate of Birth : "+getDOB()+"\nBalance : "+ getBalance());
//}
//	public String getAccNo(){return accNo;}
//    public String getName(){return name;}
//    public String getAddress(){return address;};
//    public String getPhno(){return phno;}
//    public String getDOB(){return dob;}
//    public long getBalance(){return balance;}
//    
//    public void setAddress(String add)
//    {
//        address=add;
//    }
//    public void setPhno(String phno)
//    {
//        this.phno=phno;
//    }
//            
//}
//class SavingsAccount extends Account
//{
//    public SavingsAccount(String acc, String n, String add, String phno, String dob) {
//		super(acc, n, add, phno, dob);
//}
//	public void deposit(long amt)
//    {
//        balance+=amt;
//    }
//    public void withdraw(long amt)
//    {
//        balance-=amt;
//    }
//    @Override
//    public void display() {
//    	System.out.println("Account No : "+getAccNo()+ "\nAccount Name : "+getName()+
//    			"\nAddress : "+getAddress()+"\nPhone No : "+getPhno()+"\nDate of Birth : "+getDOB()+"\nBalance : "+ getBalance());
//}
//}
//
//class LoanAccount extends Account
//{
//    public LoanAccount(String acc, String n, String add, String phno, String dob) {
//		super(acc, n, add, phno, dob);
//	}
//	public void payEMI(long amt)
//	{
//		if (balance >= 0) {
//			 balance-=amt;
//		}
//		else {
//			System.out.println("Lowest reach!");
//		}
//       
//    }
//    public void repay(long amt)
//    {
//        if(balance==amt)
//            balance=0;
//    }
//    @Override
//    public void display() {
//    	System.out.println("Account No : "+getAccNo()+ "\nAccount Name : "+getName()+
//    			"\nAddress : "+getAddress()+"\nPhone No : "+getPhno()+"\nDate of Birth : "+getDOB()+"\nBalance : "+ getBalance());
//}
//}


 abstract class Shape {
    private static String color;
  
  public Shape(String color) {
      this.color = color;
  }
  //non-abstract method
  public static String getColor() {
      return color;
  }
  
  //abstract method
 public abstract double calculateArea();
}

 class Rectangle extends Shape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
	 super(getColor());
    this.length = length;
    this.width = width;
 }

public Rectangle(double side) {
	super(getColor());
    this.length = side;
    this.width = side;
}


 @Override
 public double calculateArea() {
    return length * width;
 }
}

 class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
	 super(getColor());
    this.radius = radius;
 }

 @Override
 public double calculateArea() {
    return Math.PI * radius * radius;
 }
}



public class Main {

	public static void main(String[] args) {

		Shape rectangle1 = new Rectangle(3, 4);
		   
	      System.out.println("Area of rectangle with length 3 and width 4: " + rectangle1.calculateArea());

	      Shape rectangle2 = new Rectangle(5);
	      System.out.println("Area of square with side length 5: " + rectangle2.calculateArea());

	      Shape circle = new Circle(2);
	      System.out.println("Area of circle with radius 2: " + circle.calculateArea());
	   }
	}
		
		
		
//		Scanner myScanner = new Scanner(System.in);
//	SavingsAccount account = new SavingsAccount("12345", "Rafi", "21/22, D", "01406843730", "12 October");
//	LoanAccount account2 = new LoanAccount("12345", "Rafi", "21/22, D", "01406843730", "12 October");
//	
//	account.display();
//	System.out.println("Add amount : ");
//	account.deposit(myScanner.nextLong());
//	System.out.println("After adding amount - ");
//	account.display();
//	System.out.println("amount of emei : ");
//	account2.payEMI(myScanner.nextLong());
//	account2.display();	
		
//		
// class MathUtils {
//    public static final double PI = 3.14159;
//    private int a;
//    private int b;
//    
//    //constuctor
//    MathUtils(int a, int b){
//        this.a = a;
//        this.b = b;
//    }
//    
//    public int multiplication(){
//        return a*b;
//    }
//    
//    public static int add(int c, int d) {
//        return c + d;
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//        double radius = 5.0;
//        double circumference = 2 * MathUtils.PI * radius;
//        // static diye method ta directly use korte pari, obj create kora lagbena
//        int sum = MathUtils.add(3, 4);
//        
//        MathUtils obj1 = new MathUtils(2, 3);
//        obj1.multiplication();
//        
//        System.out.println("Circumference: " + circumference);
//        System.out.println("Sum: " + sum);
//    
//    }
//}


		
	







