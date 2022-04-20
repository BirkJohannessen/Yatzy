package no.hvl.dat109.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "yatzy", name = "spillverdier")
public class SpillverdierDB {

	@Id
	private String spillID;
	private String spillere;
	private Integer index0;
	private Integer index1;
	private Integer index2;
	private Integer index3;
	public String getSpillere() {
		return spillere;
	}
	public void setSpillere(String spillere) {
		this.spillere = spillere;
	}
	public Integer getIndex0() {
		return index0;
	}
	public void setIndex0(Integer index0) {
		this.index0 = index0;
	}
	public Integer getIndex1() {
		return index1;
	}
	public void setIndex1(Integer index1) {
		this.index1 = index1;
	}
	public Integer getIndex2() {
		return index2;
	}
	public void setIndex2(Integer index2) {
		this.index2 = index2;
	}
	public Integer getIndex3() {
		return index3;
	}
	public void setIndex3(Integer index3) {
		this.index3 = index3;
	}
	public Integer getIndex4() {
		return index4;
	}
	public void setIndex4(Integer index4) {
		this.index4 = index4;
	}
	public Integer getIndex6() {
		return index6;
	}
	public void setIndex6(Integer index6) {
		this.index6 = index6;
	}
	public Integer getIndex7() {
		return index7;
	}
	public void setIndex7(Integer index7) {
		this.index7 = index7;
	}
	public Integer getIndex8() {
		return index8;
	}
	public void setIndex8(Integer index8) {
		this.index8 = index8;
	}
	public Integer getIndex9() {
		return index9;
	}
	public void setIndex9(Integer index9) {
		this.index9 = index9;
	}
	public Integer getIndex10() {
		return index10;
	}
	public void setIndex10(Integer index10) {
		this.index10 = index10;
	}
	public Integer getIndex11() {
		return index11;
	}
	public void setIndex11(Integer index11) {
		this.index11 = index11;
	}
	public Integer getIndex12() {
		return index12;
	}
	public void setIndex12(Integer index12) {
		this.index12 = index12;
	}
	public Integer getIndex13() {
		return index13;
	}
	public void setIndex13(Integer index13) {
		this.index13 = index13;
	}
	public Integer getIndex14() {
		return index14;
	}
	public void setIndex14(Integer index14) {
		this.index14 = index14;
	}
	public void setSpillID(String spillID) {
		this.spillID = spillID;
	}



	private Integer index4;
	private Integer index6;
	private Integer index7;	
	private Integer index8;
	private Integer index9;
	private Integer index10;
	private Integer index11;
	private Integer index12;
	private Integer index13;
	private Integer index14;

	
	//@Embedded
	public SpillverdierDB() {}
	//@Embedded
	public SpillverdierDB(String spillID, String spillere,Integer index0,Integer index1,Integer index2,Integer index3,Integer index4,Integer index5,Integer index6,Integer index7,Integer index8,Integer index9,Integer index10,Integer index11,Integer index12,Integer index13, Integer index14) {
		this.spillID=spillID;
		this.spillere=spillere;
		this.index0=index0;
		this.index1=index1;
		this.index0=index2;
		this.index1=index3;
		this.index0=index4;
		this.index1=index5;
		this.index0=index6;
		this.index1=index7;
		this.index0=index8;
		this.index1=index9;
		this.index0=index10;
		this.index1=index11;
		this.index0=index12;
		this.index1=index13;
		this.index0=index14;

	}



	public String getSpillID() {
		return spillID;
	}



	public void setMobil(String spillID) {
		this.spillID = spillID;
	}

	
}