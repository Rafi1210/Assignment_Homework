package objectClass;

class Student extends Person {

	int id;
	double cg;


	Student(String n, int a, int id, double cg) {

		super(n, a);
		
//		name= n;
//		age = a;
		
		this.id = id;
		this.cg = cg;
	}




//	public void Student(String n1, int a, int id, double cg){
//		name = n1;
//		age = a;
//		this.id = id;
//		this.cg = cg;
//	}
	
	
	void display() {
		System.out.println("Name : "+name+" Age : "+age+ " Id : "+id+" CG : "+cg);
	}
}
