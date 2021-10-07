import phone.HuaweiP40;
import phone.Phone;
import phone.SamsungGalaxy6;
import phone.SamsungGalaxyS10;
import util.Generator;


public class Main {
    public static void main(String[] args) {

        Phone Phone1 = new SamsungGalaxy6(Generator.getGeneratedLong(), 10, "white", "aluminium");
        Phone Phone2 = new SamsungGalaxyS10(Generator.getGeneratedLong(), 10, "black", "glass");
        Phone Phone3 = new HuaweiP40(Generator.getGeneratedLong(), 10, "red", "plastic");

        System.out.println(Phone1);
        System.out.println(Phone2);
        System.out.println(Phone3);

        Phone.addContact(1, 122196626, "Narcis", "Duta");
        Phone.addContact(2, 124593371, "Andreea", "Duta");
        Phone.addContact(3, 126990116, "Radu", "Duta");
        Phone.addContact(4, 129386861, "Amalia", "Duta");

        Phone.listContacts();


        Phone.sendMessage(122196626, "Welcome!");
        Phone.sendMessage(124593371, "Glad to be here!");
        Phone.sendMessage(126990116, "Where are we going in this holiday?");
        Phone.sendMessage(122196626, "In a place with a very long name. " +
                "The name of the place we will visit it is so long that exceeds 100 characters!");
        Phone.listMessages(122196626);


        Phone.call(122196626);
        Phone.call(126990116);
        Phone.call(126990116);
        System.out.println("The last calls you have made are to the next phone numbers: " + Phone.viewHistory);


    }

}
