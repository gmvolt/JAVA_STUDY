package icehs.science.Chapter10.heroes;

public abstract class Hero implements CanFight, CanFly, CanSwim {

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("이 싸운다.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("이 난다.");
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("이 헤엄친다.");
	}
	
	public void action() {
		
	}

}
