package icehs.science.Chapter06;

public class BuildingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Building building1 = new Building();
		building1.name = "국제선타워";
		building1.address = "김포동";
		building1.totalFloor = 5;
	
		System.out.println("건물명 : " + building1.name);
		System.out.println("주소 : " + building1.address);
		System.out.println("전체 층 수 : " + building1.totalFloor);
		
		building1.moveElevator();
		building1.changeAddress("비행로");
		
		System.out.println("새 주소 : " + building1.address);
	}

}
