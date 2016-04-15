import java.util.Scanner;

import movieList.*;

public class movieApp {

	static int category;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Movie[] movieList = new Movie[100];

		for (int i = 0; i < movieList.length; i++) { // create Movie objects for all films in MovieIO
			movieList[i] = MovieIO.getMovie(i - 1);
		}

		promptUser(input);  // get user input (which category to display)

		for (int i = 0; i < movieList.length; i++) {  // print all movies that match category criteria
			if (category == movieList[i].getCategory()) 
				System.out.println(movieList[i].getTitle());

		}

		input.close();
	}

	public static void promptUser(Scanner input) {
// prompt user for category to display
		
		while (true) {
			try {
				System.out.println("Welcome to the Movie List Application!\n");
				System.out.println("There are 100 Movies in this list.");
				System.out.println("What category are you interested in?");
				System.out.println("1 - Drama \n2 - Musicals \n3 - Sci-Fi \n4 - Horror \n5 - Comedy \n6 - Animated");
				System.out.print("Please enter the number corresponding to your choice: ");
				category = input.nextShort();
				input.nextLine();
				if (category < 1 || category > 6) { // discard user inputs outside 1-6 range
					System.out.println("Please enter one of the valid numbers.");
					continue;
				} else {
					break;
				}
			} catch (Exception e) {  // catch exceptions in user input and re-run
				System.out.println("Please enter one of the valid numbers.");
				input.nextLine();
				continue;
			}

		}
	}

}
