package icehs.science.Chapter03;

public class StringVariableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "김정우";
		String mathScore = "96";
		int englishScore = 82;
		
		int parseMathScore = Integer.parseInt(mathScore);
		
		System.out.println("이룸 : " + name );
		System.out.println("수학 점수 : " + mathScore);
		System.out.println("영어 점수 : " + englishScore);
		System.out.println("--------------------");
		System.out.println(mathScore + englishScore);
		System.out.println(parseMathScore + englishScore);
	}

}
