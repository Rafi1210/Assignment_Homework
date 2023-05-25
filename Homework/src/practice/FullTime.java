package practice;

public class FullTime extends Employee{

	double basicPay, medicalAll, houseRent;

	@Override
	double salary() {
		return 0;
	}
	double salary(double bP, double mA, double hR) {
		basicPay = bP + mA + hR;
		return basicPay;
	}
	
}
