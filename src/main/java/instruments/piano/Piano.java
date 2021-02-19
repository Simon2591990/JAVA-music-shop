package instruments.piano;

import instruments.Instrument;

public class Piano extends Instrument {

    private PianoType pianoType;


    public Piano(String description, double dealerPrice, double sellPrice, String brand, String colour, PianoType pianoType) {
        super(description, dealerPrice, sellPrice, brand, colour);
        this.pianoType = pianoType;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public String play(String song){
        return "The noise of " + song +  " being butchered on piano";
    }

}

