import java.util.Scanner;

import movieList.*;

public class movieApp {

	static String category;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Movie[] movieList = new Movie[100];

		for (int i = 0; i < movieList.length; i++) {
			movieList[i] = MovieIO.getMovie(i - 1);
		}

		System.out.println("Welcome to the Movie List Application!\n");
		System.out.println("There are 100 Movies in this list.");
		System.out.println("What category are you interested in?");

		category = input.nextLine();

		for (int i = 0; i < movieList.length; i++) {
			if (category.equalsIgnoreCase(movieList[i].getCategory())) 
				System.out.println(movieList[i].getTitle());
			
		}

		input.close();
	}

}
