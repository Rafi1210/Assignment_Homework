package practice;

public abstract class Employee {

	private int id;
	private String name;
	
	abstract double salary();
	
	double salary (double bp) {
		return bp;
	}

}
