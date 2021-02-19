package instruments.piano;

import instruments.Instrument;

public class Piano extends Instrument {

    PianoType pianoType;

    public Piano(String brand, String colour, double dealerPrice, PianoType pianoType) {
        super(brand, colour, dealerPrice);
        this.pianoType = pianoType;
    }

    public PianoType getPianoType() {
        return pianoType;
    }
    public String play(String song){
        return "The noise of " + song +  " being butchered on piano";
    }
}

