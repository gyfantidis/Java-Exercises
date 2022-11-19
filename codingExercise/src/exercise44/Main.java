package exercise44;

public class Main {
    public static void main(String Args[]){

        Contact contact = new Contact("Giannis", "69852");
        Contact contact1 = new Contact("Giorgos", "12345");
        Contact contact2 = new Contact("Nikolaos", "22222");
        Contact contact3 = new Contact("Pantelis", "12312");
        Contact contact4 = new Contact("Dimitrios", "69123");
        Contact contact5 = new Contact("Thanasis", "69425");
        Contact contact6 = new Contact("Pavlos", "62315");

        Contact contact7 = Contact.createContact("Petros","15951");

        MobilePhone mobilePhone = new MobilePhone("1");

        mobilePhone.printContacts();
        mobilePhone.addNewContact(contact);
        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.addNewContact(contact3);
        mobilePhone.addNewContact(contact4);
        mobilePhone.addNewContact(contact5);
        mobilePhone.addNewContact(contact7);


        mobilePhone.printContacts();

        mobilePhone.updateContact(contact2,contact6);
        mobilePhone.printContacts();

        mobilePhone.removeContact(contact5);
        mobilePhone.printContacts();


        System.out.print(mobilePhone.queryContact("Giannis").getName() );
        System.out.println(" -> " + mobilePhone.queryContact("Giannis").getPhoneNumber());



    }
}
