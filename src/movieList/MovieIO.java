package movieList;

public class MovieIO{
	
    public static Movie getMovie(int index){
    	// return title and category for a movie object from a list of 100 movies
    	
        switch (index){
            case 1:
                return new Movie("Citizen Kane", 1);
            case 2:
                return new Movie("Casablanca", 1);
            case 3:
                return new Movie("The Godfather", 1);
            case 4:
                return new Movie("Gone With The Wind", 1);
            case 5:
                return new Movie("Lawrence Of Arabia", 1);
            case 6:
                return new Movie("The Wizard Of Oz", 2);
            case 7:
                return new Movie("The Graduate", 1);
            case 8:
                return new Movie("On The Waterfront", 1);
            case 9:
                return new Movie("Schindler's List", 1);
            case 10:
                return new Movie("Singin' In The Rain", 2);
            case 11:
                return new Movie("It's A Wonderful Life", 1);
            case 12:
                return new Movie("Sunset Boulevard", 1);
            case 13:
                return new Movie("The Bridge On The River Kwai", 1);
            case 14:
                return new Movie("Some Like It Hot", 1);
            case 15:
                return new Movie("Star Wars", 3);
            case 16:
                return new Movie("All About Eve", 1);
            case 17:
                return new Movie("The African Queen", 1);
            case 18:
                return new Movie("Psycho" , 5);
            case 19:
                return new Movie("Chinatown", 1);
            case 20:
                return new Movie("One Flew Over The Cuckoo's Nest", 1);
            case 21:
                return new Movie("The Grapes Of Wrath", 1);
            case 22:
                return new Movie("2001: A Space Odyssey", 3);
            case 23:
                return new Movie("The Maltese Falcon", 1);
            case 24:
                return new Movie("Raging Bull", 1);
            case 25:
                return new Movie("E.T. The extra-terrestrial", 3);
            case 26:
                return new Movie("Dr. Strangelove", 1);
            case 27:
                return new Movie("Bonnie And Clyde", 1);
            case 28:
                return new Movie("Apocalypse Now", 1);
            case 29:
                return new Movie("Mr. Smith Goes to Washington", 1);
            case 30:
                return new Movie("The Treasure Of The Sierra Madre", 1);
            case 31:
                return new Movie("Annie Hall", 4);
            case 32:
                return new Movie("The Godfather Part II", 1);
            case 33:
                return new Movie("High Noon", 1);
            case 34:
                return new Movie("To Kill A Mockingbird", 1);
            case 35:
                return new Movie("It Happened One Night", 1);
            case 36:
                return new Movie("Midnight Cowboy", 1);
            case 37:
                return new Movie("The Best Years Of Our Lives", 1);
            case 38:
                return new Movie("Double Indemnity", 1);
            case 39:
                return new Movie("Doctor Zhivago", 1);
            case 40:
                return new Movie("North By Northwest", 1);
            case 41:
                return new Movie("West Side Story", 2);
            case 42:
                return new Movie("Rear Window", 1);
            case 43:
                return new Movie("King Kong", 5);
            case 44:
                return new Movie("The Birth Of A Nation", 1);  //ugh
            case 45:
                return new Movie("A Streetcar Named Desire", 1);
            case 46:
                return new Movie("A Clockwork Orange", 3);
            case 47:
                return new Movie("Taxi Driver", 1);
            case 48:
                return new Movie("Jaws", 5);
            case 49:
                return new Movie("Snow White And The Seven Dwarfs", 6);
            case 50:
                return new Movie("Butch Cassidy And The Sundance Kid", 1);
            case 51:
                return new Movie("The Philadelphia Story", 1);
            case 52:
                return new Movie("From Here To Eternity", 1);
            case 53:
                return new Movie("Amadeus", 1);
            case 54:
                return new Movie("All Quiet On The Western Front", 1);
            case 55:
                return new Movie("The Sound Of Music", 2);
            case 56:
                return new Movie("M*A*S*H", 4);
            case 57:
                return new Movie("The Third Man", 1);
            case 58:
                return new Movie("Fantasia", 6);
            case 59:
                return new Movie("Rebel Without A Cause", 1);
            case 60:
                return new Movie("Raiders Of The Lost Ark", 1);
            case 61:
                return new Movie("Vertigo", 1);
            case 62:
                return new Movie("Tootsie", 4);
            case 63:
                return new Movie("Stagecoach", 1);
            case 64:
                return new Movie("Close Encounters Of The Third Kind", 3);
            case 65:
                return new Movie("The Silence Of The Lambs", 5);
            case 66:
                return new Movie("Network", 1);
            case 67:
                return new Movie("The Manchurian Candidate", 1);
            case 68:
                return new Movie("An American In Paris", 1);
            case 69:
                return new Movie("Shane", 1);
            case 70:
                return new Movie("The French Connection", 1);
            case 71:
                return new Movie("Forrest Gump", 1);
            case 72:
                return new Movie("Ben-Hur", 1);
            case 73:
                return new Movie("Wuthering Heights", 1);
            case 74:
                return new Movie("The Gold Rush", 1);
            case 75:
                return new Movie("Dances With Wolves", 1);
            case 76:
                return new Movie("City Lights", 1); //comedy
            case 77:
                return new Movie("American Graffiti", 1);
            case 78:
                return new Movie("Rocky", 1);
            case 79:
                return new Movie("The Deer Hunter", 1);
            case 80:
                return new Movie("The Wild Bunch", 1);
            case 81:
                return new Movie("Modern Times", 1);  //comedy
            case 82:
                return new Movie("Giant", 1);
            case 83:
                return new Movie("Platoon", 1);
            case 84:
                return new Movie("Fargo", 1);
            case 85:
                return new Movie("Duck Soup", 4);
            case 86:
                return new Movie("Mutiny On The Bounty", 1);
            case 87:
                return new Movie("Frankenstein", 5);
            case 88:
                return new Movie("Easy Rider", 1);
            case 89:
                return new Movie("Patton", 1);
            case 90:
                return new Movie("The Jazz Singer", 1);
            case 91:
                return new Movie("My Fair Lady", 2);
            case 92:
                return new Movie("A Place In The Sun", 1);
            case 93:
                return new Movie("The Apartment", 1);
            case 94:
                return new Movie("Goodfellas", 1);
            case 95:
                return new Movie("Pulp Fiction", 1);
            case 96:
                return new Movie("The Searchers", 1);
            case 97:
                return new Movie("Bringing Up Baby", 1); //comedy
            case 98:
                return new Movie("Unforgiven", 1);
            case 99:
                return new Movie("Guess Who's Coming To Dinner", 1);
            case 100:
                return new Movie("Yankee Doodle Dandy", 2);
            default:
                return new Movie("NO SUCH MOVIE", 0);
        }
    }
}
