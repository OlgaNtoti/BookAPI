package UnipiApp;
import java.util.List;
import java.util.Scanner;

import model.BookAPI;
import model.exception.BookAPIException;
import model.thebookshelvesdb.BookshelfInfo;
import model.BookInfo;
import services.BookAPIService;


public class BookApplication {

		
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		
//δημιουργία services για την επιτυχή ανάκτηση δεδομένων από τις βάσεις
		
			final BookAPIService booksDBService = BookAPI.getBookDBService();
			final BookAPIService bookshelveDBService = BookAPI.getBookshelveDBService();
//κεντρικό μενού			
			System.out.println("UnipiBooks : Ξεκινήστε εδώ");
			
			while (true) {
				System.out.println("Τι χρειάζεται να αναζητήσετε;");
				System.out.println("1. Αναζήτησε βιβλίο.");
				System.out.println("2. Αναζήτησε βιβλιοθήκη.");
				System.out.println("3. Εμφάνιση 5 τελευταίων αναζητήσεων. ");
				System.out.println("4. Έξοδος.");
				System.out.println("Η επιλογή σας:");
				
//διάβασμα επιλογής χρήστη
				
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine();

				System.out.println("Η επιλογή σας: " + input);

				switch (input) {
				case "1":
					System.out.print("Εισάγετε παράμετρο:");
					String searchParam1 = sc.nextLine();
					try {
						final List<BookInfo> results = booksDBService.searchForBooks(searchParam1);
						System.out.println("Τα αποτελέσματα είναι:");
						System.out.println(results);	
					} catch (BookAPIException e) {
						System.err.println(e.getMessage());
					}
					break;
				case "2":
					System.out.println("Εισάγετε παράμετρο:");
					String searchParam = sc.nextLine();
					try {
						final List<BookshelfInfo> results = bookshelveDBService.getShelve();
						System.out.println("Εισάγετε παράμετρο:");
						System.out.println(results);
					} catch (BookAPIException e) {
						System.err.println(e.getMessage());
					}
					
					break;
				case "3":
					//δεν δούλεψε
					
				case "4":
					System.out.println("Επιλέχθηκε 4");
					System.exit(0); 
					break;
				default:
					System.out.println("Εισάγετε έγκυρη εντολή παρακαλώ");
				}

			}
		}
}

