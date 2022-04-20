package no.hvl.dat109.dao;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "yatzy", name = "spiller")
public class SpillerDB {

	@Id
	private String mobil;
	private String fornavn;
	private String etternavn;
	private String passord;
	private String email;
	private boolean adminaccess;
	
	//@Embedded
	public SpillerDB() {}
	//@Embedded
	public SpillerDB(String mobil, String fornavn,String etternavn, String passord, String email, boolean adminaccess) {
		this.mobil=mobil;
		this.fornavn=fornavn;
		this.etternavn=etternavn;
		this.passord=passord;
		this.adminaccess=adminaccess;
		this.email=email;
	}



	public String getMobil() {
		return mobil;
	}



	public void setMobil(String mobil) {
		this.mobil = mobil;
	}



	public String getFornavn() {
		return fornavn;
	}



	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}



	public String getEtternavn() {
		return etternavn;
	}



	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}



	public String getPassord() {
		return passord;
	}



	public void setPassord(String passord) {
		this.passord = passord;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public boolean isAdminaccess() {
		return adminaccess;
	}



	public void setAdminaccess(boolean adminaccess) {
		this.adminaccess = adminaccess;
	}
	

	
}
