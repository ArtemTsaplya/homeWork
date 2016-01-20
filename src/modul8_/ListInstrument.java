package modul8_;


public class ListInstrument {
    private String nameInstrument;
    private int priceInstrument;

    public ListInstrument(String nameInstrument, int priceInstrument) {
        this.nameInstrument = nameInstrument;
        this.priceInstrument = priceInstrument;
    }

    public String getNameInstrument() {
        return nameInstrument;
    }

    public int getPriceInstrument() {
        return priceInstrument;
    }

    @Override
    public String toString() {
        return "nameInstrument= '" + nameInstrument + '\'' + ", priceInstrument= " + priceInstrument + " UAH";
    }
}
