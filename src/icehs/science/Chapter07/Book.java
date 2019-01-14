package icehs.science.Chapter07;

public class Book {
	String title;
	int price;
	String author;
	
	Book(){
		
	}
	Book(String author){
		this.author = author;
	}
	Book(String title, String author){
		this(author);
		this.title = title;
	}
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	Book(String title, String author, int price){
		this(title, author);
		this.price = price;
	}
	
	void printBookInfo() {
		System.out.println(title);
		System.out.println(price);
		
	}
}
