package instruments.brass;

import instruments.Instrument;

public class Brass extends Instrument {
    BrassType brassType;

    public Brass(String brand, String colour, double dealerPrice, BrassType brassType) {
        super(brand, colour, dealerPrice);
        this.brassType = brassType;
    }

    public BrassType getBrassType() {
        return brassType;
    }
    public String play(String song){
        return "the sound of " + song + " can be heard. Toot toot ";
    }
}
