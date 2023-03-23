import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Contact> contacts;
    private int count;

    public Phonebook() {
        count =0;
        this.contacts = new ArrayList<>();
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public boolean addContact(Contact contact) {
        return contacts.add(contact);
    }
    public boolean removeContact(Contact contact) {
        return contacts.remove(contact);
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Contact record : contacts) {
            str.append(record + "\n");
        }
        return str.toString();
    }
}
