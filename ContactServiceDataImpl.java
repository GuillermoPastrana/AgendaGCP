//Project Agenda
package com.softtek.java.academy.service;

import com.softtek.java.academy.entities.Contact;
import com.softtek.java.academy.entities.ContactType;
import com.softtek.java.academy.util.Util;

public class ContactServiceDataImpl implements ContactServiceData{
	private Contact[] contacts;
	private int currentIndex;
	private Util util;
	
	public ContactServiceDataImpl() {
		contacts = new Contact[100];
		currentIndex = 0;
		util = new Util();	
	}
	
	public Contact createContact(Contact contact) {
		Contact newContact = new Contact(
				util.generateId(),
				contact.getFirstname(),
				contact.getLastName(),
				contact.getMotherName(),
				contact.getPhonenumber(),
				contact.getEmail(),
				contact.getContactType()
				);
		
		contacts[currentIndex] = newContact;
		currentIndex++;
		
		return newContact;
	}

	public Contact updateContact(String id, Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deletecontact(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Contact findByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Contact findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	public Contact[] findByContactType(ContactType contactType) {
		int recordsFound = 0;

		for (Contact c : contacts) {
			if (c != null && c.getContactType() == contactType) {
				recordsFound++;
			} else if (c == null) {
				break;
			}
		}
		if (recordsFound > 0) {
			Contact[] result = new Contact[recordsFound];
			int index = 0;

			for (Contact ct : contacts) {
				if (ct != null) {
					if (ct.getContactType() == contactType) {
						result[index] = ct;
						index++;
					}
					} else {
					break;
				}
			}
			return result;
		} else {
		return null;
		}
	}

	public Contact[] findAll() {
		Contact[] storedContacts = new Contact[currentIndex];
		
		for(int i = 0; i < contacts.length; i++ ) {
			Contact c = contacts[i];
			if(c != null) {
				storedContacts[i] = c;
			}else {
				break;
			}
		}
		return storedContacts;
	}

}
