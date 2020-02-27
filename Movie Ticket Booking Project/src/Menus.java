


public class Menus {


	/** Prints the Main Menu
	 * 
	 */
	public static void mainMenu() {

		System.out.println("+====================================================+");
		System.out.println("|                    Main Menu                       |");
		System.out.println("|====================================================|");
		System.out.println("|Please make a selection below:                      |");
		System.out.println("|  1. View Movies Now Playing                        |");
		System.out.println("|  2. Book Your Tickets                              |");
		System.out.println("|  3. Review Your Booking                            |");
		System.out.println("|  4. View Upcoming Movies                           |");
		System.out.println("|  5. Exit                                           |");
		System.out.println("+====================================================+");

	}
	public static void mainMenu(int selection) {

		switch(selection){

		case 1:			

			movies();
			movies(BookingProject.getChoice());
			break;	

		case 2:
			//Book your tickets
			break;

		case 3:			
			//Review bookings
			break;	

		case 4:
			upcomingMovies();
			upcomingMovies(BookingProject.getChoice());
			break;

		case 5:			
			System.exit(0);

		}
	}


	public static void movies() {
		System.out.println("+====================================================+");
		System.out.println("|                Movies Now Playing                  |");
		System.out.println("|====================================================|");
		System.out.println("|  Frozen 2            | PG    | 1h 43m |            |");
		System.out.println("|  Sonic The Hedgehog  | PG    | 1h 40m |            |");
		System.out.println("|  Jojo Rabbit         | PG-13 | 1h 48m |            |");
		System.out.println("|  Weathering with You | PG-13 | 1h 51m |            |");
		System.out.println("|                                                    |");
		System.out.println("|  1. Back to main menu                              |");
		System.out.println("+====================================================+");		
	}
	public static void movies(int selection) {

		switch(selection){

		case 1: mainMenu();
		mainMenu(BookingProject.getChoice());
		break;

		}
	}

	public static void upcomingMovies() {
		System.out.println("+====================================================+");
		System.out.println("|                  Upcoming Movies                   |");
		System.out.println("|====================================================|");
		System.out.println("|  Mulan          | NR    | March 27,2020            |");
		System.out.println("|  No Time To Die | PG-13 | April 10,2020            |");
		System.out.println("|  Black Widow    | PG-13 | April 24, 2020           |");
		System.out.println("|  F9             | PG-13 | May 22,2020              |");
		System.out.println("|                                                    |");
		System.out.println("|  1. Back to main menu                              |");
		System.out.println("+====================================================+");
	}

	public static void upcomingMovies(int selection) {
		switch(selection){

		case 1: mainMenu();
		mainMenu(BookingProject.getChoice());
		break;

		}
	}
}
