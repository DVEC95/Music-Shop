package shop.instruments;

import shop.interfaces.IPlay;
import shop.interfaces.ISell;
import shop.interfaces.Types;

public class Piano extends Instrument implements ISell, IPlay {

    private int numberOfKeys;

    public Piano(String manufacturer, String model, double buyingPrice, double sellingPrice, String material, String colour, Types type, int numberOfKeys) {
        super(manufacturer, model, buyingPrice, sellingPrice, material, colour, type);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public String play() {
        return String.format("You play the %s piano.", this.getType().getTypeValue());
    }

    public double calculateMarkup() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }

}
