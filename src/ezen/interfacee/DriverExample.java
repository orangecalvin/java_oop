package ezen.interfacee;

public class DriverExample {

	public static void main(String[] args) {
		Car car = new K3("똥차","K3",false,0);
		Driver driver = new Driver(car);
		driver.drive();
		
		car = new Avante("차차", "아반떼",false,0);
		driver.setCar(car);
		driver.drive();
		
		
	}

}
