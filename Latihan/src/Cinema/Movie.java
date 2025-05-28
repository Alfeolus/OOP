package Cinema;

public class Movie {
	private String genre;
	private String title;
	public Movie(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}
	public String getGenre() {
		return genre;
	}
	public String getTitle() {
		return title;
	}

	
}
