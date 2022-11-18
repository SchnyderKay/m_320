public class DVD extends Medien{

    private int lengthInMin;

    public DVD(String title, int year, double price, String type, int lengthInMin) {
        super(title, year, price, type);
        this.lengthInMin = lengthInMin;
    }

    public int getLengthInMin() {
        return lengthInMin;
    }

    public void setLengthInMin(int lengthInMin) {
        this.lengthInMin = lengthInMin;
    }
}

