package shop.equipment;

import shop.Item;
import shop.interfaces.ISell;

public class GuitarStrings extends Item implements ISell {

    public GuitarStrings(String manufacturer, String model, double buyingPrice, double sellingPrice) {
        super(manufacturer, model, buyingPrice, sellingPrice);
    }

    public double calculateMarkup() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }

}
