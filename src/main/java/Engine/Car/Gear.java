package Engine.Car;

import static java.lang.System.out;

public enum Gear {

    AUTOMATE("automate", "auto"),
    MANUAL("handel", "Manuel");

    private String toPersian;
    private String toFrench;


    Gear(String toPersian, String toFrench) {
        this.toPersian = toPersian;
        this.toFrench = toFrench;
    }

    public static void print() {
        Gear[] values = Gear.values();
        for (Gear value : values) {
            out.println(value);
        }
    }

    public static void printToPersian() {
        Gear[] values = Gear.values();
        for (Gear value : values) {
            out.println(value.toPersian);
        }
    }

    public static void toFrench() {
        Gear[] values = Gear.values();
        for (Gear value : values) {
            out.println(value.toFrench);
        }
    }

    public String getToPersian() {
        return toPersian;
    }

    public String getToFrench() {
        return toFrench;
    }
}
