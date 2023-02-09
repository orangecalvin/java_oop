package ezen.Qize;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Vehicle vehicle = new Vehicle();
		driver.driver(vehicle);
		
		Taxi taxi = new Taxi();
		driver.driver(taxi);
		
		Bus bus = new Bus();
		driver.driver(bus);
	}

}
