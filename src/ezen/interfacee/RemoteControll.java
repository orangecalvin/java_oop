package ezen.interfacee;

public interface RemoteControll {
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolune(int volume);
	
	// 자바8 부터 디폴트 메소드 추가
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다..");
			setVolune(RemoteControll.MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다..");
		}
	}
	public static void changeBettery() {
		System.out.println("배터리를 교환합니다..");
	}
}
