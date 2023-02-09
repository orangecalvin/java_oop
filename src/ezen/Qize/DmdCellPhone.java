package ezen.Qize;

public class DmdCellPhone extends CellPhone {
	private int channel;
	
	public DmdCellPhone() {}

	public DmdCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void trunOnDmb() {
		System.out.println("");
	}
	public void trunOffDmb() {
		System.out.println("");
	}
	public void changeChannel(int channel){
		this.channel = channel;
		System.out.println("채널을"+channel+"번 채널로 변경합니다");
	}
	
}
