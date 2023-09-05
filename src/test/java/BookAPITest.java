
import model.BookAPI;

import model.BookInfo;
//import bookshelfinfo.BookshelfInfo;
//import bookshelfvolumeinfo.BookshelfVolumeInfo;
//import bookshelvesinfo.BookshelvesInfo;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.exception.BookAPIException;
import model.thebookshelvesdb.BookshelfInfo;

//import model.thebookshelfdb.BookshelfResult;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.Assert;
import org.junit.Test;
import services.BookAPIService;
import model.VolInfo;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.net.URI;

public class BookAPITest {
	
    @Test
    public void testSearchAPI() throws BookAPIException {
        final BookAPIService bookSearchService = BookAPI.getBookDBService();
        Scanner answer=new Scanner(System.in);
        String answer2=answer.nextLine();
        final List<BookInfo> results = bookSearchService.searchForBooks(answer2);
        Assert.assertFalse(results.isEmpty());
        results.forEach(System.out::println);
    }
    public void testBookshelfAPI() throws BookAPIException {
        final BookAPIService bookshelfService = BookAPI.getBookshelveDBService();
        final List<BookshelfInfo> results = bookshelfService.getShelve();
        Assert.assertFalse(results.isEmpty());
        results.forEach(System.out::println);
    }
    
}



  