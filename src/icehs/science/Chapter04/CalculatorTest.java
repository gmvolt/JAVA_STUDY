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
		
		System.out.println("µ¡¼À °á°ú : " + plusResult);
		System.out.println("»¬¼À °á°ú : " + minusResult);
		System.out.println("°ö¼À °á°ú : " + multipleResult);
		System.out.println("³ª´°¼À °á°ú : " + divisionResult);
		System.out.println("³ª¸ÓÁö : " + remainerResult);
	}

}
