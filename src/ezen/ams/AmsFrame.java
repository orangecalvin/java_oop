package ezen.ams;
//-Dfile.encoding=MS949

import java.awt.Button;
import java.awt.Choice;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AmsFrame extends Frame {
	AccountRepository repository;
	GridBagLayout gridBagLayout;
	Label accountType,accountNB, AccName, passwdLB, inMoney;
	Choice typeChoice;
	TextField accNBText, NameText, pwText ,imText;
	Button accNBButton1, accNBButton2 , searchButton;
	
	Panel buttonPanel1 = new Panel();
	
	
	public AmsFrame() {
	this("기본 타이틀", null);
	}

	public AmsFrame(String title, AccountRepository repository ) {
		accountType = new Label("계좌종류");	// 계좌종류 라벨
		typeChoice = new Choice();				// 계좌종류 선택
		typeChoice.add("전체");
		typeChoice.add("입금계좌");
		typeChoice.add("마이너스계좌");
		accountNB = new Label("계좌번호");			//계좌번호 라벨
		accNBText = new TextField();				//계좌번호 입력칸
		accNBButton1 = new Button("조회");			//버튼1
		accNBButton2 = new Button("삭제");			//버튼2 
		AccName = new Label("예금주명");			//예금주명 라벨
		NameText = new TextField();					//예금주명 입력칸
		searchButton = new Button("검색"); 			//에금주명 검색
		passwdLB = new Label("비밀번호");			//비밀번호 라벨
		pwText = new TextField();					//비밀번호 입력칸
		inMoney = new Label("입금 금액");			//입금 금액 라벨
		imText = new TextField();					//입금 금액 입력칸
		
		
		buttonPanel1.add(accNBButton1);
		buttonPanel1.add(accNBButton2);
	}
	public void initLayout() {
		gridBagLayout = new GridBagLayout();
		setLayout(gridBagLayout);
		//계좌종류 라인
		add(accountType, 0,0,1,1,0.0);
		add(typeChoice,  1,0,1,1,0.0);
		//계좌 번호 라인
		add(accountNB,   0,1,1,1,0.0);
		add(accNBText,   1,1,1,1,0.0);
		add(buttonPanel1,2,1,1,1,0.0);
		// 예금주명 라인
		add(AccName,     0,2,1,1,0.0);
		add(NameText,    1,2,1,1,0.0);
		add(searchButton,2,2,1,1,0.0);
		// 비밀번호 라인
		add(passwdLB,    0,3,1,1,0.0);
		add(pwText,      1,3,1,1,0.0);
		add(inMoney,     2,3,1,1,0.0);
		add(imText,      3,3,1,1,0.0);
		
	}
	private void add(Component component, int gridx, int gridy,int gridwidth, int gridheight,double weightx ) {
		// 공통 속성
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.BOTH; // 공간 채워줌 중요
		constraints.insets = new Insets(5, 5, 5, 5);
		constraints.weightx = weightx;  //버튼 크기 가중치 
		constraints.weighty = 0.0;  //가중치
		// 개인 속성
		constraints.gridx = gridx;
		constraints.gridy = gridy;
		constraints.gridwidth = gridwidth;
		constraints.gridheight = gridheight;
		gridBagLayout.setConstraints(component, constraints);
		add(component);
	   }
	
	public void addEventListener() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
}
}