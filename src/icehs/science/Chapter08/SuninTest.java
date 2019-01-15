package icehs.science.Chapter08;

public class SuninTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * SunIn [] sun = new SunIn[7];
		 * 
		 * for(int i = 0 ; i <= 6 ; i++) { sun[i] = new SunIn(); } // sun[7] = new
		 */		  
		SunIn [] sun = { new SunIn(),
						 new SunIn(),
						 new SunIn(),
						 new SunIn(),
						 new SunIn(),
						 new SunIn(),
						 new SunIn() };
									
		 
		for(int i = 0 ; i <= 3 ; i++) {
			sun[i].printSuninInfo();
		}
	}

}
