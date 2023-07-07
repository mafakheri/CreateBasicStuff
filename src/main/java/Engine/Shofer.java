package Engine;

import static java.lang.System.out;

public class Shofer {

    private String typeOfLicense = "Pay 1";
    private static String name = "Farhad";

    public class License {

        public void print() {
            out.println("Class Non Static : ");
            out.println(typeOfLicense);
            out.println(name);
        }
    }

    public static class StaticLicense {

        public void print() {
            System.out.println("Class Static : ");
            //System.out.println(typeOfLicense);    // dose not work
            System.out.println(name);
        }

    }
}
