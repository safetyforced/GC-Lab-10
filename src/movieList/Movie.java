package movieList;


public class Movie {
// Movie object class.  Stores two variables to each object : title and category
	String title;
	int category;
	
	public Movie(String movie, int category) {
		// constructor
		title = movie;
		this.category = category;
	}

	public String getTitle() {
		// return title
		
		return title;
	}

	public void setTitle(String title) {
		// set title
		
		this.title = title;
	}

	public int getCategory() {
		// get category
		
		return category;
	}

	public void setCategory(int category) {
		// set category
		
		this.category = category;
	}

	
}
