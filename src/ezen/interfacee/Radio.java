package ezen.interfacee;

public class Radio implements RemoteControll {
	private int volume;
	private int memoryVolume;
	
	
	
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getMemoryVolume() {
		return memoryVolume;
	}

	@Override
	public void turnOn() {
		System.out.println("라디오 를킵니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("라디오 를끕니다");
		
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
		System.out.println("현재 라디오 볼륨"+ this.volume);
	}
		//디폴트 메소드 오버라이딩
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = volume;
			System.out.println("무음처리합니다..");
			setVolune(RemoteControll.MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다..");
			this.memoryVolume = volume;
		}
	}
	
	
	
	
}
