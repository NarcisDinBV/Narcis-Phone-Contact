import java.util.List;

public class Main {
    public static void main(String[] args) {

        Phone phone1 = new SamsungGalaxy6(SamsungGalaxy6.getGeneratedLong());
        System.out.println(phone1);
        Phone phone2 = new SamsungGalaxyS10(SamsungGalaxyS10.getGeneratedLong());
        System.out.println(phone2);

        Phone.addContact(1, 0722111222, "Narcis", "Duta");
        Phone.addContact(2, 0733222333, "Andreea", "Duta");
        Phone.addContact(3, 0744333444, "Radu", "Duta");
        Phone.addContact(4, 0755444555, "Amalia", "Duta");

        Phone.listContacts();

        Phone.sendMessage(0722111222, "Bine ai venit!");
        Phone.sendMessage(0733222333, "Bine te-am gasit!");
        Phone.sendMessage(0744333444, "Unde mergem in vacanta?");
        Phone.sendMessage(0722111222, "La mare!");

        Phone.listMessages(0722111222);

        Phone.call(0722111222);

        System.out.println(Phone.viewHistory);




    }

}
