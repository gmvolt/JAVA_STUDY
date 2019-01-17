package icehs.science.workshop3.book;

public class Book {
	private String isbn;
	private String title;
	private String author;
	private int price;
	private String issueDate;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		printBookInfo();
	}
	public Book(String isbn, String title, String author, int price) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		printBookInfo();
	}
	public Book(String isbn, String title, String author, int price, String issueDate) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		this.issueDate = issueDate;
		printBookInfo();
	}
	public String getIsbn() {
		return isbn;
	}
	public int getPrice() {
		return price;
	}
	public void printBookInfo() {
		System.out.print("[力格] " + this.title +
						  " [历磊] " + this.author);
		if(this.price != 0) {
			System.out.print(" [啊拜] " + this.price);
		}
		if(this.issueDate != null) {
			printDate(this.issueDate);
		}
		System.out.println();
		
	}
	private void printDate(String date) {
		System.out.print(" [惯青老] " + date);
	}
}
