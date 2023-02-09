package oop;

public class StudentApp {

	public static void main(String[] args) {
		Student  student = new Student("김규래" , "무역학과");
        String name = student.getName();
        System.out.println(student.getssn());
        System.out.println(name);
        System.out.println(student.getSubject());
        System.out.println();
        student.study();
       // 클래스 변수는 클래스이름.변수명 
        System.out.println(Student.SCHOOL_NAME);
        Student student2 = new Student("홍길동", "컴퓨터 공학과");
        System.out.println(student2.getssn());
		System.out.println(Student.SCHOOL_NAME);
		
		// 권장
		Student.printSchoolName();
		//비권장
//		student.printSchoolName();
		
		
		
	}

}
