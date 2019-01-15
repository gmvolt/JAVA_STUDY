package icehs.science.Chapter07;

public class Movie {

	private String title;
	private String director;
	private String genre;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title; //return this.title;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getDirestor() {
		return director;
	}
	
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
