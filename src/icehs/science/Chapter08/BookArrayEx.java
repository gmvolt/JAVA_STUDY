package icehs.science.Chapter08;

public class BookArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] book = {
				new Book("습관의 힘", 16000),
				new Book("빅 피쳐", 12000),
				new Book("7년 후", 13500)
		};
		
		for(int i = 0 ; i < book.length ; i++) {
			book[i].printBookInfo();
		}
		
	}

}
