package icehs.science.Chapter11;

import java.util.ArrayList;

public class StudentListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("�̼���", 80, 90, 95));
		list.add(new Student("������", 95, 89, 92));
		list.add(new Student("������", 88, 97, 94));
		
		for(Student student: list) {
			System.out.println(student.getName() + " ( ���� : " + student.getKor() + 
													", ���� : " + student.getEng() + 
													", ���� : " + student.getMath() + " )");
		}
	}

}
