package instruments.guitar;

import instruments.Instrument;

public class Guitar extends Instrument {

    GuitarType guitarType;

    public Guitar(String brand, String colour, double dealerPrice, GuitarType guitarType) {
        super(brand, colour, dealerPrice);
        this.guitarType = guitarType;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }
    public int getNumberOfStrings(){
        return this.guitarType.getNumberOfStrings();
    }
    public String play(){
        return "The noise of stairway to heaven being butchered";
    }
}
