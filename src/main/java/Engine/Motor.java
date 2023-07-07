package Engine;

public class Motor extends Engine{

    @Override
    public boolean isMoving() {
        return isTurnedOn;
    }

    @Override
    public String getMark() {
        return "Honda Motor";
    }
}
