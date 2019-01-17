package icehs.science.workshop3.book;



public class BookArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(">>> 도서 출력");
		Book[] books = {
				new Book("조선 실록의 세계", "오항녕"),
				new Book("이공계 글쓰기", "유키 히로시"),
				new Book("1111111111111", "인권을 찾아서", "조효제", 19500),
				new Book("9788964150719", "인문학 따라 쓰기", "고정욱", 14800),
				new Book("2222222222222", "혼자가 되는 책들", "최원호", 15000, "2016년 02월 29일"),
				new Book("3333333333333", "법륜 스님의 행복", "법륜", 14000, "2016년 01월 25일"),
				new Book("4444444444444", "하버드 새벽 4시 반", "웨이슈잉", 14000, "2014년 12월 29일")
		};
		
		System.out.println("");
		System.out.println(">>> 가격이 15000원 이하인 도서 찾기");
		for(int i = 0 ; i < books.length ; i++) {
			if(books[i].getPrice() <= 15000 && books[i].getPrice() != 0) {
				books[i].printBookInfo();
			}
		}
		
		System.out.println("");
		System.out.println("ISBN 번호가 9788964150719인 도서 구매하기");
		for(int i = 0 ; i < books.length ; i++) {
			if(books[i].getIsbn() == "9788964150719") {
				books[i].printBookInfo();
			}
		}
	}

}
