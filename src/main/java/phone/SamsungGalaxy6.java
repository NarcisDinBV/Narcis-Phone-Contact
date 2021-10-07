package phone;

import util.Generator;

public class SamsungGalaxy6 extends Samsung {
    private long imei;


    public SamsungGalaxy6(long imei, int batteryLife, String color, String material) {
        super();
        this.imei = imei;
        setBatteryLife(batteryLife);
        this.setColor(color);
        this.setMaterial(material);

    }



    @Override
    public String toString() {
        return "SamsungGalaxy6{" +
                "\t imei = " + Generator.getGeneratedLong() +
                "\t Color " + this.getColor() +
                "\t Phone Case Material " + this.getMaterial() +
                "\t Battery life is " + getBatteryLife() + " h" +
                '}';
    }

    public long getImei() {
        return imei;
    }

    public void setImei(long imei) {
        this.imei = imei;
    }
}

