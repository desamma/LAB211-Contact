package Controller;

import Common.Library;
import Common.Validate;
import Model.Contact;
import Model.ContactList;
import Model.Name;
import View.Display;
import View.Menu;


public class Controller extends Menu<String> {

    private static String[] mc = {"Add a Contact", "Display all Contact", "Delete a Contact", "Exit"};
    private Library lib;
    private ContactList cList;
    private Display d;
    private Validate val;
    
    public Controller() {
        super("MENU", mc);
        lib = new Library();
        cList = new ContactList();
        d = new Display();
        val = new Validate();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                addContact();
                break;
            case 2:
                displayAll();
                break;
            case 3:
                deleteContact();
                break;
            case 4:
                System.exit(0);

        }
    }

    public void addContact(){
        int id;
        id = cList.size();
        id++;
        String fName = lib.getString("Enter first name: ");
        String lName = lib.getString("Enter last name: ");
        String g = lib.getString("Enter group: ");
        String a = lib.getString("Enter Address: ");
        String p;
        do {
            p = lib.getString("Enter Phone: ");
            if (!val.validFormat(p)) {
                System.out.println("""
                                    Please input Phone flow
                                    • 1234567890
                                    • 123-456-7890
                                    • 123-456-7890 x1234
                                    • 123-456-7890 ext1234
                                    • (123)-456-7890
                                    • 123.456.7890
                                    • 123 456 7890
                                    """);
            }
        } while (!val.validFormat(p));
        Name n = new Name(fName, lName);
        cList.add(new Contact(id, n, g, a, p));
        System.out.println("Successful");
    }
    
    public void displayAll(){
        System.out.println("--------------------------------- Display all Contact ----------------------------");
        d.printAll(cList);
    }
    
    public void deleteContact(){
        int id = lib.getInt("Enter ID: ", "ID is digit and positive");
        if (cList.findById(id) != null){
            cList.remove(cList.findById(id));
            System.out.println("Successful");
        }
        else System.out.println("The list is empty");
    }
}
