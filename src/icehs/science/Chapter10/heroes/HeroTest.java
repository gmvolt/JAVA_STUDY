package icehs.science.Chapter10.heroes;

public class HeroTest {
	public static void main(String[] args) {
		Hero [] hero = {
				new SuperMan(),
				new BatMan(),
				new SpideMan(),
				//new Hero()
		};
		System.out.println("[Hero 목록] : 슈퍼맨, 배트맨, 스파이더맨");
		
		for (int i = 0 ; i < hero.length ; i++) {
			hero[i].action();
		}
	}
}
