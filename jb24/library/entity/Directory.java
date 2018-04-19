package by.epam.jb24.library.entity;

public class Directory extends PrintedEdition{
	private String sphere;
	
	public Directory(String inSphere, int inPrintSize,double inPrice) {
		super(inPrintSize, inPrice);
		this.sphere = inSphere;
	}

	
	@Override
	public String toString() {
		return "Directory: sphere =" + sphere + ", PrintSize =" + getPrintSize() + ", Price =" + getPrice()
				+ "]";
	}


	public String getSphere() {
		return sphere;
	}

	public void setSphere(String sphere) {
		this.sphere = sphere;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((sphere == null) ? 0 : sphere.hashCode());
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
		Directory other = (Directory) obj;
		if (sphere == null) {
			if (other.sphere != null)
				return false;
		} else if (!sphere.equals(other.sphere))
			return false;
		return true;
	}


	@Override
	public void printInfo() {
		System.out.println(this.toString());
		
	}
	
	
	
}
