package practice;

public class Fianl_01 {
	    public static void main(String[] args) {
	        try {
	            Vehicle car = new Vehicle("Toyota Camry", -15.5, 5);
	            System.out.println(car.toString());
	        } catch (NegativeValueException e) {
	            System.out.println("Exception occurred: " + e.getMessage());
	        }
	    }
	


}
