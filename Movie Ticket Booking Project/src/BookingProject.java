import java.util.Scanner;

import database.Driver;

/**
 * 
 * @author Andrew Saeyang
 *
 */
public class BookingProject {

	public static void main(String[] args) {
		
		
		Menus.mainMenu();
		
		//getChoice();

		Menus.movies();
		Menus.upcomingMovies();
		
		//Driver.getName();
	}
	
	
	/** Gets user's menus selection
	 * 
	 * @return int of user's selection
	 */
	public static int getChoice() {
		Scanner scanner = new Scanner(System.in);
		
		return scanner.nextInt();
		
	}

}
