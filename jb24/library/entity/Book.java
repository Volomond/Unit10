package by.epam.jb24.library.entity;

import java.io.PrintStream;

public class Book extends PrintedEdition {
	private String title;
	private String author;
	
	public Book(String inTitle, String inAuthor,int inPrintSize, double inPrice) {
		super(inPrintSize,inPrice);
		this.title = inTitle;
		this.author = inAuthor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void view(int inPrintSize, double inPrice) {
		System.out.println("Book: " + title + " " + author + inPrintSize + inPrice);
	}

	@Override
	public String toString() {
		return "Book: title=" + title + ", author=" + author + ", PrintSize =" + getPrintSize() + ", Price ="
				+ getPrice();
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public void printInfo() {
		System.out.println(this.toString());
		
	}
		
	
}
