package icehs.science.Chapter05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 92;
		
		if (score >= 90 && score <=100) {
			System.out.println("100점 이하 ~ 90점 이상 : A학점 입니다.");
		} else if (score >= 80) {
			System.out.println("90점 미만 ~ 80점 이상 : B학점 입니다.");
		} else if (score >= 70) {
			System.out.println("80점 미만 ~ 70점 이상 : C학점 입니다.");
		} else if (score >= 60) {
			System.out.println("70점 미만 ~ 60점 이상 : D학점 입니다.");
		} else {
			System.out.println("60점 미만 : F학점 입니다.");
		}
	}

}
