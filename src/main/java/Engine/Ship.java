package Engine;

import static java.lang.System.out;

public class Ship extends Engine{
    @Override
    public boolean isMoving() {
        protectedMethod();
        return false;
    }

    @Override
    public String getMark() {
        return "Ship";
    }

    @Override
    public String toString() {
        return "Ship is inheritance of " + super.toString();
    }

    public void printReference() {
        out.println(this.toString());
    }

    public void printReference(Object object) {
        out.println(object);
    }

    public void printReference(String object) {
        out.println(object);
    }
}
