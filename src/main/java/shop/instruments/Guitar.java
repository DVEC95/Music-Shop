package shop.instruments;

import shop.interfaces.IPlay;
import shop.interfaces.ISell;
import shop.interfaces.Types;

public class Guitar extends Instrument implements IPlay, ISell {

    private int numberOfStrings;
    private int numberOfFrets;

    public Guitar(String manufacturer, String model, double buyingPrice, double sellingPrice, String material, String colour, Types type, int numberOfStrings, int numberOfFrets) {
        super(manufacturer, model, buyingPrice, sellingPrice, material, colour, type);
        this.numberOfStrings = numberOfStrings;
        this.numberOfFrets = numberOfFrets;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public int getNumberOfFrets() {
        return numberOfFrets;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public void setNumberOfFrets(int numberOfFrets) {
        this.numberOfFrets = numberOfFrets;
    }

    public String play() {
        return String.format("You play the %s guitar.", this.getType().getTypeValue());
    }

    public double calculateMarkup() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }

}
