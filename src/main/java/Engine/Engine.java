package Engine;

import static java.lang.System.out;

public abstract class Engine {

    protected boolean isTurnedOn;

    @Override
    public String toString() {
        return "Engine class";
    }

    protected final void protectedMethod() {
        out.println("This method is protected");
    }

    public void turnOn() {
        isTurnedOn = true;
    }

    public void turnOff() {
        isTurnedOn = false;
    }

    public abstract boolean isMoving();
    public abstract String getMark();

}
