package no.hvl.dat109.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "yatzy", name = "spill")
public class SpillDB {

	@Id
	private String spillID;
	private String spillere;

	
	//@Embedded
	public SpillDB() {}
	//@Embedded
	public SpillDB(String spillID, String spillere) {
		this.spillID=spillID;

	}



	public String getSpillID() {
		return spillID;
	}



	public void setSpillID(String spillID) {
		this.spillID = spillID;
	}



	public String getSpillere() {
		return spillere;
	}



	public void setSpillere(String spillere) {
		this.spillere = spillere;
	}

	
}