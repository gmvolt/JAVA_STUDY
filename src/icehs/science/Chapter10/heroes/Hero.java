package icehs.science.Chapter10.heroes;

public abstract class Hero implements CanFight, CanFly, CanSwim {

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("�� �ο��.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("�� ����.");
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("�� ���ģ��.");
	}
	
	public void action() {
		
	}

}
