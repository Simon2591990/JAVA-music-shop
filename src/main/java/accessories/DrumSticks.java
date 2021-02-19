package accessories;

public class DrumSticks extends Accessories {

    private String size;

    public DrumSticks(String description, double dealerPrice, double sellPrice, String brand, String size) {
        super(description, dealerPrice, sellPrice, brand);
        this.size = size;
    }


    public String getSize() {
        return size;
    }
}
