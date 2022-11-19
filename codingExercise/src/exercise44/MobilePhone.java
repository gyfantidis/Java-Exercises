package exercise44;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            return false;
        }

        myContacts.add(contact);
        return true;

    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int findPosition = findContact(oldContact);
        if (findPosition < 0) {
            return false;
        }

        this.myContacts.set(findPosition, newContact);
        return true;

    }

    public boolean removeContact(Contact contact) {
        int findPosition = findContact(contact);
        if (findPosition < 0) {
            return false;
        }

        this.myContacts.remove(findPosition);
        return true;


    }

    private int findContact(Contact contact) {

        return this.myContacts.indexOf(contact);

    }

    private int findContact(String name) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position>=0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");

        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". "
                    + this.myContacts.get(i).getName() + " -> "
                    + this.myContacts.get(i).getPhoneNumber());
        }
    }


}
