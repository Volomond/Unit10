package by.epam.jb24.library.entity;

import java.util.ArrayList;

public class Library {

	private ArrayList<PrintedEdition> libraLst = new ArrayList<PrintedEdition>();

	public Library() {
		
	}
	
	public void add(PrintedEdition unit) {
		libraLst.add(unit);
	}
	
	public void remove(PrintedEdition unit) {
		libraLst.remove(unit);
	}
	public ArrayList<PrintedEdition> getLibraLst() {
		return libraLst;
	}

	public void setLibraLst(ArrayList<PrintedEdition> libraLst) {
		this.libraLst = libraLst;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((libraLst == null) ? 0 : libraLst.hashCode());
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
		Library other = (Library) obj;
		if (libraLst == null) {
			if (other.libraLst != null)
				return false;
		} else if (!libraLst.equals(other.libraLst))
			return false;
		return true;
	}

	

}
