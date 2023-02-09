package ezen.abstraction;

public class KyuCar extends Car {
	
	public KyuCar() {}
	
	public KyuCar(String name,String model,boolean status,int speed) {
		this.name = name;
		this.model = model;
		this.status =status;
		this.speed = speed;
	}
	
	

	@Override
	public void turnOn() {
		System.out.println("kyu자동차 :시동을켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("kyu자동차 :시동을 끕니다");
	}

	@Override
	public void run() {
		System.out.println("kyu자동차 :출발합니다 시속:" + speed);
	}

	@Override
	public void speedUp(int speed) {
		System.out.println("kyu자동차 :속도를 올립니다:시속 " + speed);
	}

	@Override
	public void speedDown(int speed) {
		System.out.println("kyu자동차 :속도를 줄입니다 : 시속 " + speed);
	}

	@Override
	public void stop() {
		System.out.println("kyu자동차 : 차를 멈춤니다 시속:" + speed);
	}
	
	public void opencar() {
		System.out.println("kyu자동차 : 차 뚜껑을 엽니다");
	}
}
