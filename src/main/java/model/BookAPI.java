package model;
import services.BookAPIService;
import java.util.Scanner;


public class BookAPI {
			public static BookAPIService getBookDBService() {

				return new BookAPIService("https://www.googleapis.com/books/v1/volumes?","AIzaSyBFFVFvZo5tMbemfy_3Nu7uORVu8ITfN4U"); 
			}

			public static BookAPIService getBookshelveDBService() {

			return new BookAPIService("https://www.googleapis.com/books/v1/users/","AIzaSyBFFVFvZo5tMbemfy_3Nu7uORVu8ITfN4U"); 
			}
			

			
}
