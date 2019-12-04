//Project Agenda
package com.softtek.java.academy.entities;

import com.softtek.java.academy.redplace.RedPlace;

public class Contact {

	private String id;
	private String firstname;
	private String lastName;
	private String motherName;
	private String email;
	private String phonenumber;
	private ContactType contactType;
	
	public Contact(String id, String firstname, String lastName, String motherName, String email, String phonenumber,
			ContactType contactType) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		this.motherName = motherName;
		this.email = email;
		this.phonenumber = phonenumber;
		this.contactType = contactType;
	}

	public Contact() {
		this.contactType = ContactType.UNKNOWN;
	}

	public String getId() {
		return this.id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public ContactType getContactType() {
		return contactType;
	}

	public void setContactType(ContactType contactType) {
		this.contactType = contactType;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Contact.Id = " + this.getId() + "\n");
		sb.append("Contact.FirstName = " + this.getFirstname() + "\n");
		sb.append("Contact.email = " + this.getEmail() + "\n");
		sb.append("Contact.phoneNumber = " + this.getPhonenumber() + "\n");
		sb.append("Contact.contactType = " + this.getContactType() + "\n");

		return sb.toString();
	}
}
	

