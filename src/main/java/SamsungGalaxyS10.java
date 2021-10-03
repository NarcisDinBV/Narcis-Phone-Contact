import org.apache.commons.math3.random.RandomDataGenerator;

import java.util.Scanner;

public class SamsungGalaxyS10 extends Phone {
    private long imei;


    public SamsungGalaxyS10(long getGeneratedLong) {
        super();
        Scanner scanner = new Scanner(System.in);
        this.imei = getGeneratedLong;
        this.setBatteryLife(10);
        System.out.println("Please enter the color you wish for your phone!");
        this.setColor(scanner.nextLine());


        System.out.println("Please type in the material you what for your phones case!");
        this.setMaterial(scanner.nextLine());
    }

    public static long getGeneratedLong() {
        long leftLimit = 20_000_000L;
        long rightLimit = 99_000_000L;
        return new RandomDataGenerator().nextLong(leftLimit, rightLimit);
    }

    @Override
    public String toString() {
        return "SamsungGalaxy6{" +
                "\t imei = " + getGeneratedLong() +
                "\t Color " + this.getColor() +
                "\t Phone Case Material " + this.getMaterial() +
                "\t life battery is " + this.getBatteryLife() +
                '}';
    }
}

