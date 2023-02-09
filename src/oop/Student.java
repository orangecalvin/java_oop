package oop;



public class Student {
	// 필드 (인스턴스 변수,클래스 변수, 상수)
	
	//상수(관례상 ALL 대문자)
	public static final String SCHOOL_NAME = "EZN SCHOOL";
	// 클래스 (static 변수 : 모든 인스턴스들이 공유하는 데이터)
	public static int sequence = 0001;
	
	// 인스턴스 변수
	private int ssn;
	private String name;
	private String subject;
	
	// 초기화 블록
	{
		System.out.println("학생 인스턴스가 생성되었습니다..");
		System.out.println("***************************************************");
	}
	// static 초기화 블럭
	static {
		System.out.println("프로그램 로딩중....");
	}
	
	public Student() {
		this(null, null);
	}
	public Student(String name, String subject) {
		this.ssn = sequence++;
		this.name = name;
		this.subject = subject;
		System.out.println("생성자 실행됨");
	}
	
	public int getssn() {
		return ssn;
	}
	public void setssn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	// 공부하기
	public void study() {
		System.out.println("열나 공부함");
	}
	// 학교이름을 출력하는 공통기능 (클래스(stctic)메소드)
	public static void printSchoolName() {
		System.out.println(SCHOOL_NAME);
//		System.out.println(name);
	}
	
}
