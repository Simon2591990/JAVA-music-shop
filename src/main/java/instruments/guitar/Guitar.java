package instruments.guitar;

import instruments.Instrument;

public class Guitar extends Instrument {

    private GuitarType guitarType;

    public Guitar(String description, double dealerPrice, double sellPrice, String brand, String colour, GuitarType guitarType) {
        super(description, dealerPrice, sellPrice, brand, colour);
        this.guitarType = guitarType;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }
    public int getNumberOfStrings(){
        return this.guitarType.getNumberOfStrings();
    }
    public String play(String song){
        return "The noise of " + song + " being butchered on guitar";
    }
}
