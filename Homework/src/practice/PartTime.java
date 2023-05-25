package practice;

public class PartTime extends Employee{
	
	double basicPay;
	
	@Override
	double salary() {
		return 0;
	}


	double salary(double bP) {
		basicPay = bP;
		return basicPay;
	}

	


}
