public class CD extends Medien{
    private String bandname;


    public CD(String title, int year, double price, String bandname) {
        super(title, year, price);
        this.bandname = bandname;
    }

    public String getBandname() {
        return bandname;
    }

    public void setBandname(String bandname) {
        this.bandname = bandname;
    }
}
