public class DVD extends Medien{

    private int lengthInMin;

    public DVD(String title, int year, double price, int lengthInMin) {
        super(title, year, price);
        this.lengthInMin = lengthInMin;
    }

    public int getLengthInMin() {
        return lengthInMin;
    }

    public void setLengthInMin(int lengthInMin) {
        this.lengthInMin = lengthInMin;
    }
}

