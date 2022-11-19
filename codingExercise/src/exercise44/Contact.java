package exercise44;

public class Contact {
   private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String personName, String personPhoneNumber){
        Contact contact = new Contact(personName, personPhoneNumber);
        return contact;
    }
}
