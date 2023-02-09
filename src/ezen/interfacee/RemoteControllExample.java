package ezen.interfacee;

public class RemoteControllExample {

	public static void main(String[] args) {
		RemoteControll remocon = new Television();
		remocon.turnOn();
		remocon.setVolune(5);
		// 인터페이스의 디폴트 메소드 재사용
		remocon.setMute(true);
		remocon.setMute(false);
		remocon.setVolune(10);
		Television tv = (Television)remocon;
		System.out.println("현재볼륨_____:" + tv.getVolume());
		remocon.setMute(true);
		remocon.setVolune(100);
		remocon.turnOff();
		RemoteControll.changeBettery();
		
		remocon = new Radio();
		remocon.turnOn();
		remocon.setVolune(5);
		remocon.setMute(true);
		remocon.setVolune(100);
		remocon.turnOff();
		Radio radio = (Radio)remocon;
		System.out.println("현재볼륨_____:" + radio.getVolume());
		RemoteControll.changeBettery();
	}

}
