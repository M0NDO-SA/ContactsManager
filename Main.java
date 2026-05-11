public class Main {

    public static void main(String[] args) {

        ContactsManager myContactsManager = new ContactsManager();

        Contact contact1 = new Contact();

        contact1.name = "Koffi";
        contact1.phoneNumber = "0701020304";

        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact();

        contact2.name = "Awa";
        contact2.phoneNumber = "0506070809";

        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact();

        contact3.name = "Yao";
        contact3.phoneNumber = "0102030405";

        myContactsManager.addContact(contact3);

        Contact contact4 = new Contact();

        contact4.name = "Fatou";
        contact4.phoneNumber = "0777888999";

        myContactsManager.addContact(contact4);

        Contact contact5 = new Contact();

        contact5.name = "Eric";
        contact5.phoneNumber = "0555666777";

        myContactsManager.addContact(contact5);

        Contact result = myContactsManager.searchContact("Awa");

        System.out.println(result.phoneNumber);
    }
}