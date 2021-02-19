package instruments;

public abstract class Instrument implements IPlay {

    private String brand;
    private String colour;
    private double dealerPrice;

    public Instrument(String brand, String colour, double dealerPrice) {
        this.brand = brand;
        this.colour = colour;
        this.dealerPrice = dealerPrice;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public double getDealerPrice() {
        return dealerPrice;
    }
}
