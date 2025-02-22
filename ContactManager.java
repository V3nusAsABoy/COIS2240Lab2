import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Define the ContactManager class
class ContactManager {
    // List to store Contact objects
    private List<Contact> contacts;

    // Constructor to initialize the ContactManager
    public ContactManager() {
        contacts = new ArrayList<>();
    }

    // Method to add a new Contact
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // Method to remove a Contact by name
    public void removeContact(String name) {
        for(int i = 0; i < contacts.size(); i++){
            Contact contact = contacts.get(i);
            if(contact.getName() == name){
                contacts.remove(i);
                }
            }
        }

    // Method to list all Contacts
    public void listContacts() {
        for (Contact c : contacts) {
            System.out.println(c.toString());
        }
    }


}