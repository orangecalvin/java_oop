package ezen.interfacee;

public class Television implements RemoteControll {
	private int volume;
	
	
	
	public int getVolume() {
		return volume;
	}

	@Override
	public void turnOn() {
		System.out.println("tv 를킵니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("tv 를끕니다");
		
	}

	@Override
	public void setVolune(int volume) {
		if(volume > RemoteControll.MAX_VOLUME) {
			this.volume = RemoteControll.MAX_VOLUME;
		}else if(volume < RemoteControll.MIN_VOLUME) {
			this.volume = RemoteControll.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 tv 볼륨"+ this.volume);
		
	}
}
