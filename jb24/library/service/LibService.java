package by.epam.jb24.library.service;

import java.util.List;

import by.epam.jb24.library.entity.Library;
import by.epam.jb24.library.entity.PrintedEdition;

public class LibService {
	public List<PrintedEdition> find (Library library, Search seeker){
		List<PrintedEdition> units = library.getLibraLst();
		List<PrintedEdition> hasResult = null;
		hasResult = seeker.search(units);
		return hasResult;
	}
}
