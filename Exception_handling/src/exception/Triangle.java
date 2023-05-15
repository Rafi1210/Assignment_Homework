package exception;

public class Triangle   {

	private String color;
	private boolean filled;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean getFilled() {
		return filled;
	}
	public void setFilled(Boolean filled) {
		this.filled = filled;
	}
	double side1, side2, side3 ;
	Triangle(){
		side1=1;
		side2=1;
		side3=1;
	}
	public Triangle(double a , double b, double c) throws IllegalTriangleException {
		   side1=a;
           side2=b;
           side3=c;
        	if ((side1 + side2) < side3 || (side1 + side3) < side2 || (side2 + side3) < side1) {
                throw new IllegalTriangleException("Invalid triangle sides.The sum of any two sides is must be greater than the other side");
    		}
         
	}
	
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}

	public double getArea() {
		double s = getPerimeter()/2.0;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	public double getPerimeter() {
		return side1+side2+side3;
	}
	@Override
	public String toString() {
		return "Triangle : side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 ;
	}
	
}
