package services;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;


import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.BookInfo;
import model.ErrorResponse.ErrorResponse;
import model.exception.BookAPIException;
import model.thebookdb.BookResult;
import model.thebookdb.Item;
import model.thebookshelvesdb.Bookshelf;
import model.thebookshelvesdb.BookshelfInfo;



public class BookAPIService {
         
    private final String API_URL;
    private final String API_KEY;


    public BookAPIService(String aPI_URL, String aPI_KEY) {
        API_URL = aPI_URL;
        API_KEY = aPI_KEY;
    }

  //Μέθοδος για τη λήψη δεδομένων 
    
    private BookResult getAPIData(String parameter,String API_URL, String API_KEY) throws BookAPIException {
        try {
            
		final URIBuilder uriBuilder = new URIBuilder(API_URL)
		
							
							.addParameter("api_key", API_KEY);
		
							if (parameter != null ) 
							{
								uriBuilder.addParameter("q", parameter);
								
		
						}
            
            final URI uri = uriBuilder.build();


            final HttpGet getRequest = new HttpGet(uri);

            final CloseableHttpClient httpclient = HttpClients.createDefault();


            try (CloseableHttpResponse response = httpclient.execute(getRequest)) {
                
                final HttpEntity entity = response.getEntity();
                final ObjectMapper mapper = new ObjectMapper();

                if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
                    ErrorResponse errorResponse = mapper.readValue(entity.getContent(), ErrorResponse.class);
                    if (errorResponse.getStatusMessage() != null)
                        throw new BookAPIException("Error occurred on API call: " + errorResponse.getStatusMessage());
                }

                return mapper.readValue(entity.getContent(), BookResult.class);
            } catch (IOException e) {
                throw new BookAPIException("Σφάλμα κατά το αίτημα δεδομένων από το API.", e);
            }
        } catch (URISyntaxException e) {
            throw new BookAPIException("Σφάλμα κατά το αίτημα δεδομένων από το URI.", e);
        }
    }
    
    //αναζήτηση ραφιών
    public List<BookshelfInfo> getShelve() throws BookAPIException {
    	Bookshelf result = getAPIData1( API_URL, API_KEY);
		List<BookshelfInfo> shelfInfoList = new ArrayList<>(result.getItems().size());
		for (model.thebookshelvesdb.Item theItem : result.getItems()) {
			shelfInfoList.add(new BookshelfInfo(theItem));
		}
		return shelfInfoList;
	}
	
		private Bookshelf getAPIData1( String API_URL, String API_KEY)
			throws BookAPIException {
		try {
						
			final URIBuilder uriBuilder = new URIBuilder("https://www.googleapis.com/books/v1/users/102701940585560677579/bookshelves");
			final URI uri = uriBuilder.build();

			
			
			final HttpGet getRequest = new HttpGet(uri);
			final CloseableHttpClient httpclient = HttpClients.createDefault();
			
			try (CloseableHttpResponse response = httpclient.execute(getRequest)) {
				final HttpEntity entity = response.getEntity();
				final ObjectMapper mapper = new ObjectMapper();

				if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
					ErrorResponse errorResponse = mapper.readValue(entity.getContent(), ErrorResponse.class);
					if (errorResponse.getStatusMessage() != null)
						throw new BookAPIException("Παρουσιάστηκε σφάλμα κατά την κλήση του API." + errorResponse.getStatusMessage());
				}

				return mapper.readValue(entity.getContent(), Bookshelf.class);
			} catch (IOException e) {
				throw new BookAPIException("Σφάλμα κατά την αίτηση δεδομένων από το API.", e);
			}
		} catch (URISyntaxException e) {
			throw new BookAPIException("Αδυναμία δημιουργίας URI αιτήματος", e);
		}

	}
		//αναζήτηση βιβλίων
    public List<BookInfo> searchForBooks(String par) throws BookAPIException {
        BookResult result = getAPIData(par,API_URL, API_KEY);
        List<BookInfo> bookInfoList = new ArrayList<>(result.getItems().size());
        for (Item theItem : result.getItems()) {
            bookInfoList.add(new BookInfo(theItem));
        }

        return bookInfoList;}

}

   