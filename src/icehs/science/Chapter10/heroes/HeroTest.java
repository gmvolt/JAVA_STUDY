package icehs.science.Chapter10.heroes;

public class HeroTest {
	public static void main(String[] args) {
		Hero [] hero = {
				new SuperMan(),
				new BatMan(),
				new SpideMan(),
				//new Hero()
		};
		System.out.println("[Hero ���] : ���۸�, ��Ʈ��, �����̴���");
		
		for (int i = 0 ; i < hero.length ; i++) {
			hero[i].action();
		}
	}
}
