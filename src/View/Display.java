
package View;

import Model.Contact;
import Model.ContactList;

public class Display {

    public void printAll(ContactList cl) {
        int total = 0;
        if (cl.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("All Countries:");
            for (Contact c : cl) {
                total++;
                System.out.printf("%-5s%-25s%-15s%-15s%-10s%-15s%-20s\n", "ID", "Name", "First Name", "Last Name", "Group", "Address", "Phone");
                System.out.println(c);
            }
            System.out.println("Total: " + total);
        }
    }
    
}
