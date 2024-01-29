
package Model;

public class Contact {
    private int cID;
    private Name name;
    private String cGroup;
    private String cAddress;
    private String cPhone;

    public Contact(int cID, Name name, String cGroup, String cAddress, String cPhone) {
        this.cID = cID;
        this.name = name;
        this.cGroup = cGroup;
        this.cAddress = cAddress;
        this.cPhone = cPhone;
    }

    public int getcID() {
        return cID;
    }

    public void setcID(int cID) {
        this.cID = cID;
    }

    public String getcGroup() {
        return cGroup;
    }

    public void setcGroup(String cGroup) {
        this.cGroup = cGroup;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public String getcPhone() {
        return cPhone;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone;
    }

    @Override
    public String toString() {
        String fullName = name.getfName() + " " + name.getlName();
        return String.format("%-5s%-25s%-15s%-15s%-10s%-15s%-20s", cID, fullName, name.fName, name.lName, cGroup, cAddress, cPhone);
    }
    
    
}
