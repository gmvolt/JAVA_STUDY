package icehs.science.Chapter11;

import java.util.ArrayList;

public class BookListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book("Java의 정석", 346, 15000));
		books.add(new Book("Oracle 11g", 560, 18000));
		books.add(new Book("JSP 따라하기", 271, 12000));
		
		for(int i = 0 ; i < books.size() ; i++) { 
			System.out.println((i + 1) + ". " + books.get(1).getName() + 
								"(" + books.get(i).getPage() + "page) : " + 
								books.get(i).getPrice() + "원");
		}
		System.out.println();
		
		for(Book book : books) {
			System.out.println(book.getName() + "(" + book.getPage() + "page) : " + book.getPrice() + "원");
		}
 	}

}
