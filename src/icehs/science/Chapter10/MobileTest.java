package icehs.science.Chapter10;

public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile [] mobile = {
			new Galaxy(),
			new IPhone()
		};
		mobile[0].setProduction("Galaxy");
		mobile[1].setProduction("IPhone");
		((Galaxy)(mobile[0])).setOsVer("안드로이드 오레오");
		((IPhone)(mobile[1])).setColor("흰색");
		
		System.out.println(mobile[0].getProduction() + " : " + ((Galaxy)(mobile[0])).getOsVer());
		mobile[0].call(5);
		mobile[0].charge(30);
		
		System.out.println(mobile[1].getProduction() + " : " + ((IPhone)(mobile[1])).getColor());
		mobile[1].call(10);
		mobile[1].charge(15);
	}

}
