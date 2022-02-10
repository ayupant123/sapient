package com.tms.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Ayushi Pant
 * @see Bean Class for Training module
 * @since Jan 2020
 * @version 1.0
 */

@Entity
@Table(name="trainer")
public class TrainerRegistration {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="trid")
	private int trId;
    @Column(name="trname")
	private String trName;
    @Column(name="trYearsofExp")
	private int trYearsOfExp;
    @Column(name="AreaofExp")
	private String trAreaOfExpertise;
    @Column(name="trEmail")
	private String trEmail;
    @Column(name="trPassword")
	private String trPassword;
    @Column(name="trMailingAddress")
    private String trMailingAddress;
    @Column(name="trNumCompaniesTrained")
    private int numCompaniesTrained;
    @Column(name="trFees")
    private double trFees;
	/**
	 * @return the trId
	 */
	public int getTrId() {
		return trId;
	}
	/**
	 * @param trId the trId to set
	 */
	public void setTrId(int trId) {
		this.trId = trId;
	}
	/**
	 * @return the trName
	 */
	public String getTrName() {
		return trName;
	}
	/**
	 * @param trName the trName to set
	 */
	public void setTrName(String trName) {
		this.trName = trName;
	}
	/**
	 * @return the trYearsOfExp
	 */
	public int getTrYearsOfExp() {
		return trYearsOfExp;
	}
	/**
	 * @param trYearsOfExp the trYearsOfExp to set
	 */
	public void setTrYearsOfExp(int trYearsOfExp) {
		this.trYearsOfExp = trYearsOfExp;
	}
	/**
	 * @return the trAreaOfExpertise
	 */
	public String getTrAreaOfExpertise() {
		return trAreaOfExpertise;
	}
	/**
	 * @param trAreaOfExpertise the trAreaOfExpertise to set
	 */
	public void setTrAreaOfExpertise(String trAreaOfExpertise) {
		this.trAreaOfExpertise = trAreaOfExpertise;
	}
	/**
	 * @return the trEmail
	 */
	public String getTrEmail() {
		return trEmail;
	}
	/**
	 * @param trEmail the trEmail to set
	 */
	public void setTrEmail(String trEmail) {
		this.trEmail = trEmail;
	}
	/**
	 * @return the trPassword
	 */
	public String getTrPassword() {
		return trPassword;
	}
	/**
	 * @param trPassword the trPassword to set
	 */
	public void setTrPassword(String trPassword) {
		this.trPassword = trPassword;
	}
	/**
	 * @return the trMailingAddress
	 */
	public String getTrMailingAddress() {
		return trMailingAddress;
	}
	/**
	 * @param trMailingAddress the trMailingAddress to set
	 */
	public void setTrMailingAddress(String trMailingAddress) {
		this.trMailingAddress = trMailingAddress;
	}
	/**
	 * @return the numCompaniesTrained
	 */
	public int getNumCompaniesTrained() {
		return numCompaniesTrained;
	}
	/**
	 * @param numCompaniesTrained the numCompaniesTrained to set
	 */
	public void setNumCompaniesTrained(int numCompaniesTrained) {
		this.numCompaniesTrained = numCompaniesTrained;
	}
	/**
	 * @return the trFees
	 */
	public double getTrFees() {
		return trFees;
	}
	/**
	 * @param trFees the trFees to set
	 */
	public void setTrFees(double trFees) {
		this.trFees = trFees;
	}
	@Override
	public String toString() {
		return "TrainerRegistration [trId=" + trId + ", trName=" + trName + ", trYearsOfExp=" + trYearsOfExp
				+ ", trAreaOfExpertise=" + trAreaOfExpertise + ", trEmail=" + trEmail + ", trPassword=" + trPassword
				+ ", trMailingAddress=" + trMailingAddress + ", numCompaniesTrained=" + numCompaniesTrained
				+ ", trFees=" + trFees + "]";
	}
	
	
	
}