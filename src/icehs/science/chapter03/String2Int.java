package icehs.science.chapter03;

public class String2Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "25";
		String second = "20";
		
		int intfirst = Integer.parseInt(first);
		int intsecond = Integer.parseInt(second);
		
		System.out.println(first + second);
		System.out.println(intfirst + intsecond);
		System.out.println(first + second + intfirst + intsecond);
		System.out.println(intfirst + intsecond + first + second);
		System.out.println(first + intfirst);
		}

}
