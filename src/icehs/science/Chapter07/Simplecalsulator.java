package icehs.science.Chapter07;

public class Simplecalsulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		
		Simplecalsulator.printTitle();
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		Simplecalsulator.printTail();
	}
	
	public static void printTitle() {
		System.out.println("=====계산기 프로그램을 시작합니다.=====");
	}
	
	public static void printTail() {
		System.out.println("========== Bye~ Bye~ ==========");
	}
}
