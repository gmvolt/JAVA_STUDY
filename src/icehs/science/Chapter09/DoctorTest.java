package icehs.science.Chapter09;

public class DoctorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dentist dent = new Dentist("ȫ�浿");
		System.out.println(dent.getDepartment() + " : " +dent.getName() + "������");
		dent.treatPatirnt();
		dent.pullOutTooth();
	
	}

}
