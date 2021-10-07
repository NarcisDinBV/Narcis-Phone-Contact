package phone;

import phoneMenu.Call;
import phoneMenu.Contact;
import phoneMenu.Message;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private static Call call;
    private static int batteryLife;
    private String color;
    private String material;

    public static int getBatteryLife() {
        return batteryLife;
    }

    public static void setBatteryLife(int batteryLife) {
        Phone.batteryLife = batteryLife;
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
        Phone.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
    }

    public Phone() {
    }

    static List<Contact> contactList = new ArrayList<>();
    static List<Message> listMessages = new ArrayList<>();
    public static List<Call> viewHistory = new ArrayList<>();


    public static void addContact(int index, int phoneNumber, String firstName, String lastName) {
        Contact newContact = new Contact(index, phoneNumber, firstName, lastName);
        contactList.add(newContact);
    }

    public static void listContacts() {
        for (Contact e : contactList) {
            System.out.println(e);
        }
    }


    public static void sendMessage(long phoneNumber, String messageContent) {
        if (messageContent.length() < 100) {
            if (Phone.getBatteryLife() <= 1) {
                System.out.println("Please recharge the phone in order to send this message!");
                System.out.println("The level of the Battery life is: " + Phone.getBatteryLife());
            } else {
                Message messageToBeSent = new Message(1, phoneNumber, messageContent);
                listMessages.add(messageToBeSent);
                Phone.setBatteryLife(Phone.getBatteryLife() - 1);
            }
            System.out.println("Now, the level of you battery is " + Phone.getBatteryLife());
        } else {
            System.out.println("The message content should not exceed 100 characters!");
        }
    }


    public static void listMessages(long phoneNumber) {
        for (Message e : listMessages) {
            if (e.getPhoneNumber() == phoneNumber) {
                System.out.println(e);
            }
        }
    }

    public static void call(long phoneNumber) {
        if (Phone.getBatteryLife() <= 2) {
            System.out.println("Please recharge the phone in order to make this phone call!");
            System.out.println("The level of the Battery life is: " + Phone.getBatteryLife());
        } else {
            Call newPhoneCall = new Call(phoneNumber);
            viewHistory.add(newPhoneCall);
            Phone.setBatteryLife(Phone.getBatteryLife() - 2);
        }
    }

    public static void viewHistory(long phoneNumber) {
        for (Call e : viewHistory) {
            if (e.getPhoneNumber() == phoneNumber)
                System.out.println(e);
        }
    }


}

