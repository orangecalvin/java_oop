package ezen.abstraction;


public class CarApp {

	public static void main(String[] args) {
		Car car =new KyuCar("BMW","Gt",true,0);
		
		car.turnOn();
		car.run();
		car.speedUp(80);
		car.speedDown(20);
		car.stop();
		car.turnOff();
		KyuCar kyuCar = (KyuCar) car;
		kyuCar.opencar();
		
	}

}
