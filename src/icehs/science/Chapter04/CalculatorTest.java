package icehs.science.Chapter04;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = 20;
		int secondNum = 7;
		
		int plusResult = firstNum + secondNum;
		int minusResult = firstNum - secondNum;
		int multipleResult = firstNum * secondNum;
		int divisionResult = firstNum / secondNum;
		int remainerResult = firstNum % secondNum;
		
		System.out.println("���� ��� : " + plusResult);
		System.out.println("���� ��� : " + minusResult);
		System.out.println("���� ��� : " + multipleResult);
		System.out.println("������ ��� : " + divisionResult);
		System.out.println("������ : " + remainerResult);
	}

}
