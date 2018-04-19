package by.epam.jb24.library.main;

import java.util.List;

import by.epam.jb24.library.entity.Book;
import by.epam.jb24.library.entity.Directory;
import by.epam.jb24.library.entity.Library;
import by.epam.jb24.library.entity.Magazine;
import by.epam.jb24.library.entity.PrintedEdition;
import by.epam.jb24.library.service.Search;
import by.epam.jb24.library.service.Searcher;
import by.epam.jb24.library.view.PrintBook;
import by.epam.jb24.library.view.PrintList;
import by.epam.jb24.library.view.Printer;

public class DemoLibrary {

	public static void main(String[] args) {
		Library myLibra = new Library();

		myLibra.add(new Book("Lord of the rings: brotherhood of the ring","J.Tolkin", 1000000,20.5));
		myLibra.add(new Book("Lord of the rings: two towers","J.Tolkin", 1000000,20.5));
		myLibra.add(new Book("Lord of the rings: king's return","J.Tolkin", 1000000,20.5));
		myLibra.add(new Book("Game of thrones","J.Martin", 100000,15.5));
		myLibra.add(new Book("Withcher","A.Sapkovski", 50000,10));
		myLibra.add(new Magazine("Top Gear",5000,5));
		myLibra.add(new Magazine("Salon",5000,3));
		myLibra.add(new Directory("Phonebook",12000,2.5)); 
		
		List<PrintedEdition> lists = myLibra.getLibraLst();
		print(new PrintList(),lists);
		myLibra.remove(new Book("Lord of the rings: king's return","J.Tolkin", 1000000,20.5));
		print(new PrintList(),lists);
		Search seeker = new Searcher (new Book("Lord of the rings: brotherhood of the ring","J.Tolkin", 1000000,20.5));
		List<PrintedEdition> serResultList = seeker.search(lists);
		print(new PrintList(),serResultList);
		printBook(new PrintBook(),serResultList);
	}
	
	public static void print(Printer toPrintObj, List<PrintedEdition> lists) {
		toPrintObj.print(lists);
	}
	public static void printBook(PrintBook printBook, List<PrintedEdition> serResultList) {
		printBook.print(serResultList);
	}
	
}
