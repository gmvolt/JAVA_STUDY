package icehs.science.Chapter11;

import java.util.ArrayList;

public class StudentListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("이순신", 80, 90, 95));
		list.add(new Student("김유신", 95, 89, 92));
		list.add(new Student("강감찬", 88, 97, 94));
		
		for(Student student: list) {
			System.out.println(student.getName() + " ( 국어 : " + student.getKor() + 
													", 영어 : " + student.getEng() + 
													", 수학 : " + student.getMath() + " )");
		}
	}

}
