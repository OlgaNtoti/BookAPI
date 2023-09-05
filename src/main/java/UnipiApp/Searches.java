package UnipiApp;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Searches {
	
	private String searches[];

	public Searches(String[] searches) {
		this.searches = searches;

	}
//δημιουργία μεταβλητής με 5 εγγραφές
	public Searches() {
		this.searches = new String[5];
	}

	public void log() throws IOException {
		// TODO Auto-generated method stub



		
		
		//αποθήκευση σε text
		FileWriter writer = new FileWriter("named_searches.txt");
		for (String name : searches) {
			
			writer.write(name + "\n");
		}
		writer.close();
		System.out.println("Named searches saved to file.");
		
	}

	public String[] load() throws IOException{
		// TODO Auto-generated method stub

//HashMap<String, String> namedSearches = new HashMap<>();

		//άνοιγμα και απεικόνιση
	
			FileReader reader = new FileReader("named_searches.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			int index=0;
			
			while ((line = bufferedReader.readLine()) != null && index<5) {

				searches[index++]= line;
			}
			reader.close();
			System.out.println("Named searches retrieved from file: " + searches);
			return searches;
	
	}
	
	//temp πίνακας
	public void addSearch (String search) {
		String tmp[] = new String [5];
		
		tmp [0] = search;
		for (int i=1; i<5; i++) {
			tmp [i]= searches [i-1];
		
		}
		searches = tmp; 
		
	}

	public String[] getSearches() {
		return searches;
	}

	public void setSearches(String[] searches) {
		this.searches = searches;
	}
}