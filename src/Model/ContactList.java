
package Model;

import java.util.ArrayList;

public class ContactList extends ArrayList<Contact>{
    
    public Contact findById(int id) {
        for (Contact f : this) {
            if (f.getcID() == id) {
                return f;
            }
        }
        return null;
    }
}
