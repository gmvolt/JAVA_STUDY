package icehs.science.Chapter08;

public class BookArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] book = {
				new Book("������ ��", 16000),
				new Book("�� ����", 12000),
				new Book("7�� ��", 13500)
		};
		
		for(int i = 0 ; i < book.length ; i++) {
			book[i].printBookInfo();
		}
		
	}

}
