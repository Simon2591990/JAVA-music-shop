package instruments.guitar;

public enum GuitarType {

    ACOUSTIC(6),
    ELECTRIC(6),
    SEVEN_STRING(7),
    BASS(4),
    FIVE_STRING_BASS(5);

    private final int numberOfStrings;

    GuitarType(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
