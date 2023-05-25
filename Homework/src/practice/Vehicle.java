package practice;
    //Ques no 1 
 class Vehicle <T> {

	 private Vehicle<T> vehicleInfo;
	 private double mileage;
	 private int capacity;
	 
	 Vehicle(Vehicle<T> vInfo, double m, int c){
		 vehicleInfo = vInfo;
		 mileage = m;
		 capacity = c;
	 }

	public Vehicle<T> getVehicleInfo() {
		return vehicleInfo;
	}

	public void setVehicleInfo(Vehicle<T> vehicleInfo) {
		this.vehicleInfo = vehicleInfo;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleInfo=" + vehicleInfo + ", mileage=" + mileage + ", capacity=" + capacity + "]";
	}
	 
}
