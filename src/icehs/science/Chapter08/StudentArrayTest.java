package icehs.science.Chapter08;

public class StudentArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] student = {
				new Student("������", "STU001","010-1234-5678"),
				new Student("�̼���", "STU002","010-2345-6789"),
				new Student("������", "STU003","010-9876-5432")
		};
		
		for(int i = 0 ; i < student.length ; i++) {
			student[i].printStudentInfo();
		}
		
	}

}
