package icehs.science.Chapter09;

public class DoctorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dentist dent = new Dentist("È«±æµ¿");
		System.out.println(dent.getDepartment() + " : " +dent.getName() + "¼±»ý´Ô");
		dent.treatPatirnt();
		dent.pullOutTooth();
	
	}

}
