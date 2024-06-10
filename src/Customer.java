import java.util.ArrayList;

public class Customer {
	
	private String Name;
	private String LastName;
	private String Phone;
	private String Email;
	private String ID;
	
	private ArrayList<Vehicle> vehicles = new ArrayList<>();
	private int totalcost;
	
	
	public Customer(String name, String lastName, String phone, String email, String iD) {
		Name = name;
		LastName = lastName;
		Phone = phone;
		Email = email;
		ID = iD;
		//this.vehicles = new ArrayList<>();
	}
	
	
	public boolean hasVehicle() {
		return !this.vehicles.isEmpty();
	}
	
	public void addVehicle(Vehicle v) {
		this.vehicles.add(v);
	}
	
	

	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getPhone() {
		return Phone;
	}


	public void setPhone(String phone) {
		Phone = phone;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}


	public void setVehicles(ArrayList<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}


	public int getTotalcost() {
		return totalcost;
	}


	public void setTotalcost(int totalcost) {
		this.totalcost = totalcost;
	}
	
	
	
	
	
}
