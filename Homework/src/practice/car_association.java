package practice;

import java.util.ArrayList;

class Car{
	private int VIN;
	private String company;

	private ArrayList<Customer> customers;
    Car() {
	}
	public Car(int VIN, String company){
		this.VIN=VIN;
		this.company=company;
		customers = new ArrayList<Customer>();
		
	}
	public String getcompanyname() {
		return company;
	}
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	public int getnumberofCustomers() {
		return customers.size();
	}

}

class Customer{
	private String name;
	private String number;
	private ArrayList<Car> cars;
	Customer(){
		
	}
	public Customer(String name, String number) {
		this.name=name;
		this.number=number;
		cars = new ArrayList<Car>();
	}
	
	public String getname() {
		return name;
	}
	public String getnumber() {
		return number;
	}
	public void addCar(Car c) {
		cars.add(c);
		
	}
	public int getnumberofCar() {
		return cars.size();
	}
	
}


public class car_association {

	public static void main(String[] args) {

		ArrayList<Car> carmain = new ArrayList<Car>();
		ArrayList<Customer> customain = new ArrayList<Customer>();
	
		
		Car c1 = new Car(1, "Ferrary");
		
		carmain.add(c1);
		
		Customer cu1 = new Customer("Rafi", "014xxxxxxxx");
		
		customain.add(cu1);
		
		c1.addCustomer(cu1);
		cu1.addCar(c1);
		
		
		System.out.println("Rafi has bought "+ c1.getcompanyname()+ " Car");
		System.out.println(c1.getcompanyname()+" has bought by "+ cu1.getnumberofCar()+" Customer and the customer name and number  is "+cu1.getname()+" - "+cu1.getnumber() );
	}
}
