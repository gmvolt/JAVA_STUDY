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
		System.out.println("�л� �̸� : " + name);
		System.out.println("�й� : " + id);
		System.out.println("���� ���� : " + kor);
		System.out.println("���� ���� : " + eng);
		System.out.println("���� ���� : " + math);
		
	}
	
	void changeStudentId(String newId) {
		id = newId;
	}
}
