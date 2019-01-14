package icehs.science.Chapter06;

public class StudentTest {
	public static void main(String[] args) {
		Student hong = new Student();
		
		hong.name = "홍길동";
		hong.id = "S001";
		hong.kor = 94;
		hong.eng = 80;
		hong.math = 89;
		
		hong.printStudentInfo();
		
		System.out.println("학번 변경");
		hong.changeStudentId("STU0001");
	
		hong.printStudentInfo();
		int avg = hong.calculateAverage();
		System.out.println("평균 성적 : " + avg);
	}
}
