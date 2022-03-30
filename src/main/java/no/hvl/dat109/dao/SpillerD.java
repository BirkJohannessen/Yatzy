package no.hvl.dat109.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * @author anine & am
 *
 */

@Entity
@Table(schema = "Dat109_prosjekt")
public class SpillerD {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String brukernavn;
    private String passord;
    private String navn;
    private String epost;

    public SpillerD(int id, String brukernavn, String passord, String navn, String epost) {
        this.id = id;
        this.brukernavn = brukernavn;
        this.passord = passord;
        this.navn = navn;
        this.epost = epost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrukernavn() {
        return brukernavn;
    }

    public void setBrukernavn(String brukernavn) {
        this.brukernavn = brukernavn;
    }

    public String getPassord() {
        return passord;
    }

    public void setPassord(String passord) {
        this.passord = passord;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

}
