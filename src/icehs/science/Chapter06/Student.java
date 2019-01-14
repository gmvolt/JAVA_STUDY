package icehs.science.Chapter06;

public class Student {
	String name;
	String id;
	int kor;
	int eng;
	int math;
	
	int calculateAverage() {
		int Average = (kor + eng + math) / 3;
		return Average;
	}
	
	void printStudentInfo() {
		System.out.println("학생 이름 : " + name);
		System.out.println("학번 : " + id);
		System.out.println("국어 성적 : " + kor);
		System.out.println("영어 성적 : " + eng);
		System.out.println("수학 성적 : " + math);
		
	}
	
	void changeStudentId(String newId) {
		id = newId;
	}
}
