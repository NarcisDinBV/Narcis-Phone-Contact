import java.util.ArrayList;
import java.util.List;

public class Phone {
    private int batteryLife;
    private String color;
    private String material;


    static List<Contact> contactList = new ArrayList<>();
    static List<Message> messageList = new ArrayList<>();
    static List<Call> viewHistory = new ArrayList<>();
    static List<Phone> listofPhoneBrands = new ArrayList<>();


    public Phone(long number) { //Acest constructor -------------------------------------------------------------------------------
            }

    public Phone() { //si acest constructor vine de la Samsung S10-------------------------------------------------------------------------------

    }


    public static void addContact(int index, int phoneNumber, String firstName, String lastName) {
        Contact newContact = new Contact(index, phoneNumber, firstName, lastName);
        contactList.add(newContact);
    }

    public static void listContacts() {
        for (Contact e : contactList) {
            System.out.println(e);
        }
    }

    public static void sendMessage(long number, String messageContent) {
        Message messageToBeSent = new Message(number, messageContent);
        messageList.add(messageToBeSent);
    }

    public static void listMessages(long number) {
        for (Message e : messageList) {
            if (e.getNumber() == number) {
                System.out.println(e);
            }
        }
    }

    public void listOfPhoneCalls(long number) {
        Call newPhoneCall = new Call(number);
        viewHistory.add(newPhoneCall);
    }

    public static void call(long number) {
        for (Contact e : contactList) {
            if (e.getIndex() == 2)
                System.out.println(viewHistory);
        }
    }


    public void listofPhoneBrands (long number){
        Phone newBrand = new Phone(number); // mi-a cerut sa creez un constructor. De ce?-----------------------------------
        listofPhoneBrands.add(newBrand);
    }




    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Phone(int batteryLife, String color, String material) {
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
    }
}

