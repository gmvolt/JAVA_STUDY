package icehs.science.Chapter09;

public class InherTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		System.out.println("=====Student=====");
		student.eat();
		student.study();
		
		System.out.println("=====Teacher=====");
		teacher.eat();
		teacher.teach();
	}

}
