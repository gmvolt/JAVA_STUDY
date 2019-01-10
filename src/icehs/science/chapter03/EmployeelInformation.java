package icehs.science.chapter03;

public class EmployeelInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		int joinyear = 2002;
		int thisyear = 2019;
		
		System.out.println("이름 : " + name);
		System.out.println("입사년도 : " + joinyear);
		System.out.println("근무년수 : " + (thisyear - joinyear));
	}

}
