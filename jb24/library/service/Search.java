package by.epam.jb24.library.service;

import java.util.ArrayList;
import java.util.List;

import by.epam.jb24.library.entity.Book;
import by.epam.jb24.library.entity.PrintedEdition;

public interface Search {
	List<PrintedEdition> search (List<PrintedEdition> unit);

}
