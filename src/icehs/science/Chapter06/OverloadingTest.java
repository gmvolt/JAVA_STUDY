package icehs.science.Chapter06;

public class OverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading over = new Overloading();
		over.addition(100, 200);
		over.addition(20.5, 11);
		over.addition("20.5", "��");
		over.addition("�����", 16);
		over.addition(2019, "��");
	}

}
