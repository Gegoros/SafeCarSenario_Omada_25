import java.util.ArrayList;

public class SafeCar {
	
	private ArrayList<Customer> customers = new ArrayList<>();
	private ArrayList<Vehicle> vehicles = new ArrayList<>();
	
	
	public void mainEvents() {
		Customer c1 = createCustomer("Maria","Papadopoulou","2310264368","maria.papadopoulou@gmail.com","AO79432");
		Customer c2 = createCustomer("Evanthia","Papagianni","2310245368","evanthia.papagianni@gmail.com","AO77813");
		Customer c3 = createCustomer("Vasilis","Karagiannis","2310245668","ioannis.karagiannis@gmail.com","AO45698");
		
		Vehicle v1 = createVehicle("Mercedes","GLC","XKP8923","2020","7C3FR76A515072256");
		Vehicle v2 = createVehicle("Subaru","Forester","NII4269","2018","7C3FR76A555071465");
		Vehicle v3 = createVehicle("Ford","Ranger","KOH4681","2022","7C3FR76A55504645");
		
		InsurancePolicy ip1 = new InsurancePolicy("ΜI93", "Mikti asfalisi", "6");
		InsurancePolicy ip2 = new InsurancePolicy("B56", "Basiki asfalisi", "6");
		InsurancePolicy ip3 = new InsurancePolicy("O58", "Me odiki", "6");
		
		
		InsuranceContract ic1 = new InsuranceContract(c1, v1, ip2, 60);
		InsuranceContract ic2 = new InsuranceContract(c2, v2, ip1, 120);
		InsuranceContract ic3 = new InsuranceContract(c2, v3, ip3, 80);
		
		
		updateInsuranceContractData(c1, v1, ip2, 60);
		updateInsuranceContractData(c2, v2, ip1, 120);
		updateInsuranceContractData(c2, v3, ip3, 80);
		
		//Print Data
		System.out.println("Insurance Contract Data:");
		System.out.println("-------");
		
		ic1.printData();
		ic2.printData();
		ic3.printData();
		
		
		System.out.println("--------------");
		System.out.println("Customer Data:");
		System.out.println("----");
		
		String s;
		for (Customer c : customers) {
			s = c.getName();
			//Get every vehicle customer owns
			if (c.hasVehicle()) {
				for(Vehicle v : c.getVehicles()) {
					if (c.getVehicles().contains(v)) {
						s = s + " " + v.getPinakida();
					}
				}
			}
			s = s + " " + c.getTotalcost();
			System.out.println(s);
		}
	}
	
	
	public Customer createCustomer(String name, String lastname, String phone, String email, String id) {
		//Check if id exists
		for(Customer c : customers) {
			if (id.equals(c.getID())) {
				return null;
			}
		}
		//Create Customer and add them to the list
		Customer c0 = new Customer(name, lastname, phone, email, id);
		customers.add(c0);
		return c0;
		
	}
	
	public Vehicle createVehicle(String marka, String model, String pinakida, String year, String arithmos_plaisiou) {
		//Check if id exists
		for(Vehicle v : vehicles) {
			if (arithmos_plaisiou.equals(v.getArithmos_Plaisiou())) {
				return null;
			}
		}
		//Create Vehicle and add them to the list
		Vehicle v0 = new Vehicle(marka, model, pinakida, year, arithmos_plaisiou);
		vehicles.add(v0);
		return v0;
		
	}
	
	
	public void updateInsuranceContractData(Customer c, Vehicle v, InsurancePolicy i, int cost) {
		
		c.addVehicle(v);
		c.setTotalcost(c.getTotalcost() + cost);
		
		/*ic.getCustomer().addVehicle(ic.getVehicle());
		ic.getCustomer().setTotalcost(ic.getCustomer().getTotalcost() + ic.getCost());*/
		
		
	}
	
	
	
}
