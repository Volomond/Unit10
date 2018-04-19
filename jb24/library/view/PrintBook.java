package by.epam.jb24.library.view;

import java.util.List;

import by.epam.jb24.library.entity.Book;
import by.epam.jb24.library.entity.Library;
import by.epam.jb24.library.entity.PrintedEdition;

public class PrintBook implements Printer{

	@Override
	public void print(List<PrintedEdition> unit) {
		System.out.println("Your book(s): ");
		System.out.printf("%-50s%-25s%-20s%-5s%n","Title", "Author", "PrintSize", "Price");
		System.out.println("-----------------------------------------------------------------------------------------------------");
			for(PrintedEdition pBook: unit) {
				Book b = (Book) pBook;
				System.out.printf("%-50s%-25s%-20s%-5s%n",b.getTitle(), b.getAuthor(), b.getPrintSize(), b.getPrice());
			}
		
	}

}
