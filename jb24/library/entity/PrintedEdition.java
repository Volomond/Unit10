package by.epam.jb24.library.entity;

public abstract class PrintedEdition {

	private int printSize;
	private double price;
	
	public PrintedEdition(int inPrintSize, double price) {
		this.printSize = inPrintSize;
		this.price = price;
	}
	
	public abstract void printInfo();
	
	public int getPrintSize() {
		return printSize;
	}
	public void setPrintSize(int printSize) {
		this.printSize = printSize;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + printSize;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrintedEdition other = (PrintedEdition) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (printSize != other.printSize)
			return false;
		return true;
	}
	
	
}

