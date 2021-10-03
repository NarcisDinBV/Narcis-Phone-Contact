
public class Contact {
    private int index;
    private int phoneNumber;
    private String firstName;
    private String lastName;


    public Contact(int index, int phoneNumber, String firstName, String lastName) {
        this.index = index;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber=" + phoneNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public int getIndex() {
        return index;
    }
}
