package movieList;


public class Movie {

	String title;
	String category;
	
	public Movie(String movie, String cat) {
		title = movie;
		category = cat;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	
}
