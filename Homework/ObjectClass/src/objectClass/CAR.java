package objectClass;

 class CAR {

	private String CARTYPE;
	private String CARCOMPANY;
	private double CARPRICE;

	CAR(){		
	}
	//THIS Constructor(parameterized) is to access array
	
	CAR(String type, String company, double price){
		this.CARTYPE = type;
		this.CARCOMPANY = company;
		this.CARPRICE = price;
	}
	
	public void setcarType(String T){
		this.CARTYPE = T;
	}
	public String getcarType() {
		return CARTYPE;
	}
	
	public void setcarCompany(String C){
		this.CARCOMPANY = C;
	}
	public String getcarCompany() {
		return CARCOMPANY;		
	}
	
	public void setcarPrice(double P){
		this.CARPRICE = P;
	}
	public double getcarPrice() {
		return CARPRICE;
	}

	public String display() {
		return CARTYPE+"- CARTYPE"+ CARCOMPANY+" - CARCOMPANY"+ CARPRICE+"- CARPRICE";
	}
	
	public boolean equals(CAR obj) {
		if(CARPRICE==obj.getcarPrice()) {
			return true;
		}
		else {
			return false;
		}
	}
	public int compareTo(CAR obj) {
		if(CARPRICE>obj.getcarPrice()) {
			return 1;
		}
		else if (CARPRICE == obj.getcarPrice()) {
			return 0;
		}
		else {
	    	return -1;
		}		
	}
}
