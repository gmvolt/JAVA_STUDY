package icehs.science.Chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 2;
		int second = 3;
		int third = 4;
		int forth = 5;
		int fifth = 23;
		int sixth = 96;
		
		int result = first * second;
		System.out.print(first + " * " + second + " : ");
		if(result >= 100) {
			System.out.println("세 자리 수 이상입니다.");
		}else if(result >=10) {
			System.out.println("두 자리 수 입니다.");
		}else if(result >= 0) {
			System.out.println("한 자리 수 입니다.");
		}else {
			System.out.println("음수는 확인하지 않습니다.");
		}
		
		result = third * forth;
		System.out.print(third + " * " + forth + " : ");
		if(result >= 100) {
			System.out.println("세 자리 수 이상입니다.");
		}else if(result >=10) {
			System.out.println("두 자리 수 입니다.");
		}else if(result >= 0) {
			System.out.println("한 자리 수 입니다.");
		}else {
			System.out.println("음수는 확인하지 않습니다.");
		}
		
		result = fifth * sixth;
		System.out.print(fifth + " * " + sixth + " : ");
		if(result >= 100) {
			System.out.println("세 자리 수 이상입니다.");
		}else if(result >=10) {
			System.out.println("두 자리 수 입니다.");
		}else if(result >= 0) {
			System.out.println("한 자리 수 입니다.");
		}else {
			System.out.println("음수는 확인하지 않습니다.");
		}
		
		result = first * (-1) * second;
		System.out.print(first + " * " + (-1) * second + " : ");
		if(result >= 100) {
			System.out.println("세 자리 수 이상입니다.");
		}else if(result >=10) {
			System.out.println("두 자리 수 입니다.");
		}else if(result >= 0) {
			System.out.println("한 자리 수 입니다.");
		}else {
			System.out.println("음수는 확인하지 않습니다.");
		}
	}

}
