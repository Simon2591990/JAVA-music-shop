package instruments.brass;

import instruments.Instrument;

public class Brass extends Instrument {
    BrassType brassType;

    public Brass(String description, double dealerPrice, double sellPrice, String brand, String colour, BrassType brassType) {
        super(description, dealerPrice, sellPrice, brand, colour);
        this.brassType = brassType;
    }

    public BrassType getBrassType() {
        return brassType;
    }
    public String play(String song){
        return "the sound of " + song + " can be heard. Toot toot ";
    }
}
