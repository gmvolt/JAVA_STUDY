package icehs.science.Chapter07;

public class Movie {

	String title;
	String director;
	String genre;
	
	public Movie() {
		
	}

	public Movie(String title, String director) {
		this.title = title;
		this.director = director;
	}

	public Movie(String title, String director, String genre) {
		super();
		this.title = title;
		this.director = director;
		this.genre = genre;
	}
	
	

}
