
public class InsuranceContract {
	
	private Customer customer;
	private Vehicle vehicle;
	private InsurancePolicy insurancePackage;
	private int cost;
	
	
	
	public InsuranceContract(Customer customer, Vehicle vehicle, InsurancePolicy insurancePackage, int cost) {
		this.customer = customer;
		this.vehicle = vehicle;
		this.insurancePackage = insurancePackage;
		this.cost = cost;
	}
	
	
	
	
	public void printData() {
		System.out.println(customer.getName() + " " + vehicle.getPinakida() + " " +
				insurancePackage.getDescription() + " " +  cost);
	}
	
	
	
	
	
	
	
	
	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public Vehicle getVehicle() {
		return vehicle;
	}



	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}



	public InsurancePolicy getInsurancePackage() {
		return insurancePackage;
	}



	public void setInsurancePackage(InsurancePolicy insurancePackage) {
		this.insurancePackage = insurancePackage;
	}



	public int getCost() {
		return cost;
	}



	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	
	
}
