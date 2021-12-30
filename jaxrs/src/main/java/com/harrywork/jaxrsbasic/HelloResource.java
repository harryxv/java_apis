package com.harrywork.jaxrsbasic;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.harrywork.addressbook.AddressBookFactory;
import com.harrywork.addressbook.AddressBook;
import com.harrywork.addressbook.Contact;

import java.util.Iterator;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        AddressBook addressBook = AddressBookFactory.createAddressBook();
        Iterator<Contact> contacts = addressBook.listAll();
        StringBuilder stringBuilder = new StringBuilder("Hello,");
        while(contacts.hasNext()){
            stringBuilder.append(contacts.next().getName());
            stringBuilder.append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}