package icehs.science.Chapter05;

public class AgeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 18;
		
		if (age > 19) {
			System.out.println("성인 입니다. 입장하세요.");
		} else if (age >= 13) {
			System.out.println("청소년 입니다. 청소년 관람가 영화를 보세요.");
		} else {
			System.out.println("어린이 입니다. 전 연령 관람가 영화를 보세요.");
		}
	}

}
