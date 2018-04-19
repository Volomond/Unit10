package by.epam.jb24.library.service;

import java.util.ArrayList;
import java.util.List;

import by.epam.jb24.library.entity.Book;
import by.epam.jb24.library.entity.PrintedEdition;

public class Searcher implements Search{
	private Book objToSearch = null;
		
	public Searcher(Book objToSearch) {
		this.objToSearch = objToSearch;
	}

	@Override
	public ArrayList<PrintedEdition> search(List<PrintedEdition> unit) {
		ArrayList<PrintedEdition> searchResult = new ArrayList<PrintedEdition>();
		//System.out.println("Your book(s): ");
			for(PrintedEdition printSearch: unit) {
				if(printSearch instanceof Book) {
					if(printSearch.equals(objToSearch)) {
						searchResult.add(printSearch);
					}
				}
			}
			return searchResult;
		
	}
}
