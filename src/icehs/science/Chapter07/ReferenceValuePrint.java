package icehs.science.Chapter07;

public class ReferenceValuePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Publication pub1 = new Publication();
		Publication pub2 = new Publication();
		
		System.out.println("pub1의 객체 주소값");
		System.out.println(pub1);
		
		System.out.println("pub2의 객체 주소값");
		System.out.println(pub2);
		
		int i = 10;
		System.out.println("int 변수 저장값 : " + i);
	}

}
