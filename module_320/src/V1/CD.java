package V1;

public class CD extends Medien{
    private String bandname;

    public CD(String title, int year, double price, String type, String bandname) {
        super(title, year, price, type);
        this.bandname = bandname;
    }

    public String getBandname() {
        return bandname;
    }

    public void setBandname(String bandname) {
        this.bandname = bandname;
    }
}
