package ezen.Qize;

public class CellPhoneExample {

	public static void main(String[] args) {
		DmdCellPhone dmdCellPhone = new DmdCellPhone("자바폰","검정",10);
		System.out.println("모델" + "======" + dmdCellPhone.getModel()+ "======" );
		System.out.println("색상:" + dmdCellPhone.getColor());
		System.out.println("채널:" + dmdCellPhone.getChannel());
		
		dmdCellPhone.powerOn();
		dmdCellPhone.bell();
		dmdCellPhone.sendVoice("방가");
		dmdCellPhone.receiveVoice("잘가~");
		dmdCellPhone.hangUp();
		dmdCellPhone.trunOnDmb();
		dmdCellPhone.changeChannel(15);
		dmdCellPhone.trunOffDmb();
		dmdCellPhone.powerOff();
	}

}
