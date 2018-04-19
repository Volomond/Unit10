package by.epam.jb24.library.entity;

public class Magazine extends PrintedEdition{
	private String publisher;
	
	public Magazine(String inPublisher,int inPrintSize,double inPrice ) {
		super(inPrintSize, inPrice);
		this.publisher = inPublisher;
	}
	

	@Override
	public String toString() {
		return "Magazine: publisher =" + publisher + ", PrintSize =" + getPrintSize() + ", Price =" + getPrice();
	}


	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
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
		Magazine other = (Magazine) obj;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		return true;
	}
	
	@Override
	public void printInfo() {
		System.out.println(this.toString());
	}

}
