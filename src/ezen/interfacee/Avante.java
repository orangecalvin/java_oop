package ezen.interfacee;

public class Avante implements Car {
	private String name;
	private String model;
	private boolean status;
	private int speed;
	
	public Avante() {}
	
	
	public Avante(String name, String model, boolean status, int speed) {
		this.name = name;
		this.model = model;
		this.status = status;
		this.speed = speed;
	}
	
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	@Override
	public void turnOn() {
		System.out.println("Avante :시동을 켭니다.. ");
	}

	@Override
	public void turnOff() {
		System.out.println("Avante :시동을 끕니다... ");
	}

	@Override
	public void run() {
		System.out.println("Avante : 출발합니다... ");
	}

	@Override
	public void speedUp(int speed) {
		this.speed += speed;
		System.out.println("Avante : 주행합니다... 시속: " + speed +"km");
	}

	@Override
	public void speedDown(int speed) {
		this.speed -= speed;
		System.out.println("Avante : 속도를 줄입니다...시속: "+ speed + "km");
	}

	@Override
	public void stop() {
		System.out.println("Avante :정지합니다... ");
	}
	
}
