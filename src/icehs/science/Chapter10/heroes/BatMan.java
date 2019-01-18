package icehs.science.Chapter10.heroes;

public class BatMan extends Hero {
	public void action() {
		System.out.print("배트맨");
		super.swim();
		System.out.print("배트맨");
		super.fight();
	}
}
