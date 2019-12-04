//Project Agenda
package com.softtek.java.academy.redplace;

import com.softtek.java.academy.entities.Contact;
import com.softtek.java.academy.entities.ContactType;
import com.softtek.java.academy.service.ContactServiceData;
import com.softtek.java.academy.service.ContactServiceDataImpl;

public class RedPlace {
	private Contact contact;
	private Contact friend;
	private Contact anotherFriend;
	
	public static void main(String[] args) {
		RedPlace p = new RedPlace();
		p.crearContactos();
		
		ContactServiceData csd = new ContactServiceDataImpl();
		Contact myContact = csd.createContact(p.contact);
		Contact myFriendContact = csd.createContact(p.friend);
		Contact myOtherFriendContact = csd.createContact(p.anotherFriend);

		Contact[] contacts = csd.findByContactType(ContactType.FRIEND);
		if (contacts != null) {
			for (Contact c : contacts) {
				System.out.print(c);
			}
		} else {
			System.out.println("No se encontraron contactos del tipo" + ContactType.FRIEND);
		}
	}
	
	
	public void crearContactos() {
		contact = new Contact();
		contact.setFirstname("Jose");
		contact.setLastName("Sanchez");
		contact.setMotherName("Herrera");
		contact.setEmail("jose.amititla@softtek.com");
		contact.setPhonenumber("18000800");
		
		friend = new Contact("1","Javier","Juarez","Rosas","javier.juarez@gmail.com",
				"81200100",ContactType.FRIEND);
		
		anotherFriend = new Contact("1","Javier","Juarez","Rosas","javier.juarez@gmail.com",
				"81200100",ContactType.FRIEND);
	}
}
