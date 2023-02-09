package ezen.ams;
//한글 깨질떄 -Dfile.encoding=MS949
import java.awt.Button;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Properties;

/**
 * 계좌관리 애플리케이션 GUI
 *  
 * @author 김규래
 * @Date 2023. 1. 16.
 */
public class AccountFrame extends Frame {
	AccountRepository repository;
	
	Label receiveLabel , attachLabel;
	TextField receiveTF,attachTF;
	Button searchButton;
	GridBagLayout gridBagLayout;
	TextArea contentsArea;
	Button sendButton, cancleButton;
	Panel buttonPanel = new Panel();
	
	private static String fontName;
	private static int fontSize;
	
	static {
		Properties prop = new Properties();
		try {
			prop.load(AccountFrame.class.getResourceAsStream("config.properties"));
			fontName = prop.getProperty("font.family");
			fontSize = Integer.parseInt(prop.getProperty("font.size"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public AccountFrame() {
		this("기본 타이틀", null);
		
	}
	
	public AccountFrame(String title, AccountRepository repository) {
		this.repository = repository;
		receiveLabel = new Label("받는사람");	//받는사람 라벨
		receiveTF = new TextField();     	 	//받는사람 입력칸
		attachLabel = new Label("첨부파일");	//첨부파일 라벨
		attachTF = new TextField();				//첨부파일 입력칸
		searchButton = new Button("찾기");		//첨푸파일 버튼
		contentsArea = new TextArea();			// 메일입력칸
		sendButton = new Button("전송");		//전송버튼
		cancleButton = new Button("취소"); 		// 취소버튼
		buttonPanel.add(sendButton);			
		buttonPanel.add(cancleButton);
		Font font = new Font(fontName, Font.BOLD, fontSize);
		receiveLabel.setFont(font);
	}

	public void initLayout() {
		gridBagLayout = new GridBagLayout();
		setLayout(gridBagLayout);
		add(receiveLabel,0,0,1,1,0.0);
		add(receiveTF,   1,0,2,1,1.0);
		add(attachLabel, 0,1,1,1,0.0);
		add(attachTF,    1,1,1,1,1.0);
		add(searchButton,3,1,1,1,0.2);
		add(contentsArea,0,2,4,2,1.0);
		add(buttonPanel, 0,4,4,1,1.0);
		
	}
	// GridBag위한컴포너트 배치
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
		searchButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				findByAccountNumber();
			}
		});
	}
	//계좌 조회 기능
	public void findByAccountNumber() {
		String accountNum = attachTF.getText();
		// 데이터 유효성 검증
		if(accountNum == null || accountNum.trim().length() == 0) {
			System.out.println("계좌번호를 생략할 수 없습니다..");
			return;
		}else {
			 Account account = repository.findByNumber(accountNum);
			 if(account != null) {
				 contentsArea.append(account.toString() + "\n");
			 }else {
				 contentsArea.append("조회된 계좌가 존재하지 않습니다 \n");
			 }
		}
	}
	
//	public static void main(String[] args) {
//		AccountFrame frame5 = new AccountFrame("AWT 컴포넌트틀");
//		frame5.initLayout();
//		frame5.addEventListener();
//		frame5.setSize(400,300);
//		frame5.setVisible(true);
//	}
	}