package numbers;

public class Digit {
    private int position;
    private int value;

    public Digit() {
        position = 0;
        value = 0;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Numbers.Digit{" +
                "position=" + position +
                ", value=" + value +
                '}';
    }
}
