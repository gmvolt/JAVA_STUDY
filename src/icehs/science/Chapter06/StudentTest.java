package icehs.science.Chapter06;

public class StudentTest {
	public static void main(String[] args) {
		Student hong = new Student();
		
		hong.name = "ȫ�浿";
		hong.id = "S001";
		hong.kor = 94;
		hong.eng = 80;
		hong.math = 89;
		
		hong.printStudentInfo();
		
		System.out.println("�й� ����");
		hong.changeStudentId("STU0001");
	
		hong.printStudentInfo();
		int avg = hong.calculateAverage();
		System.out.println("��� ���� : " + avg);
	}
}
