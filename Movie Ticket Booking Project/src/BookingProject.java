import database.Driver;

/**
 * 
 * @author Andrew Saeyang
 *
 */
public class BookingProject {

	public static void main(String[] args) {
		
		printMenu();
		//Driver.getName();
	}
	
	/**
	 * 
	 */
	public static void printMenu() {
		
		System.out.println("======================================================");
		System.out.println("|                    Main Menu                       |");
		System.out.println("======================================================");
		System.out.println("| 1. View Movies Now Playing                         |");
		System.out.println("| 2. Book Your Tickets                               |");
		System.out.println("| 3. Review Your Booking                             |");
		System.out.println("| 4. View Upcoming Movies                            |");
		System.out.println("| 5. Exit                                            |");
		System.out.println("|                                                    |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");
	}

}
