package icehs.science.Chapter05;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		int num3 = 40;
		int num4 = 50;
		int num5 = 80;
	
		double result = num1 * num2 /2 * 0.6;
		result += (num3 + num4) /2 *0.13;
		result += num5 * 0.27;
		//result = result + num5 * 0.27;
		
		System.out.println("�� ���� : " + (int)result);
		
		switch((int)result/10) {
		case 9 : System.out.println("Special Class�Դϴ�."); break;
		case 8 : System.out.println("Gold Class�Դϴ�."); break;
		case 7 : System.out.println("Silver Class�Դϴ�."); break;
		case 6 : System.out.println("Bronze Class�Դϴ�."); break;
		default : System.out.println("Member�Դϴ�."); break;
		}
	}

}
