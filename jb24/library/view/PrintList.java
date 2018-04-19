package by.epam.jb24.library.view;

import java.util.List;

import by.epam.jb24.library.entity.PrintedEdition;

public class PrintList implements Printer{

	@Override
	public void print(List<PrintedEdition> unit) {
		System.out.println("Your Library: ");
				for(PrintedEdition pEdition : unit) {
			pEdition.printInfo();
		}System.out.println("-----------------------------------------------------------------");
		
	}
}


