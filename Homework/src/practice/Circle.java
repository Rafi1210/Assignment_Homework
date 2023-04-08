package practice;

public class Circle {
	public double rad = 3 ;
	Circle()
	{
		
	}
	
	Circle(double r){
		rad = r;
	}
	double getArea() {
	double Area = rad*rad*3.14;
		return Area;
	}
	public static void main(String[] args) {
		Circle myCircle = new Circle();
		System.out.println(myCircle.getArea());
	}

}
