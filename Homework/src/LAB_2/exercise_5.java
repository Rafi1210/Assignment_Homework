package LAB_2;
import java.util.Scanner;
public class exercise_5 {
	
	public static void main(String[] args) {
	
		double p,  q, radius;
		Scanner sc = new Scanner(System.in);
		p =sc.nextDouble();
		q = sc.nextDouble();
	    radius = sc.nextDouble();
	    double x = Math.pow(p, 2);
	    double y = Math.pow(q, 2);
	    double r = Math.pow(radius, 2);
		if ((x+y)>r) {
			System.out.println("The point is outside the circle");
		} 
		else if ((x+y)<r) {
			System.out.println("The point is inside the circle");			
		}
		else if((x+y)==r){
			System.out.println("The point is within the circle");
		}
	}
	
}


