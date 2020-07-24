package shop.instruments;

import shop.Item;
import shop.interfaces.IPlay;
import shop.interfaces.ISell;
import shop.interfaces.Types;

public abstract class Instrument extends Item implements IPlay, ISell {

    private String material;
    private String colour;
    private Types type;

    public Instrument(String manufacturer, String model, double buyingPrice, double sellingPrice, String material, String colour, Types type) {
        super(manufacturer, model, buyingPrice, sellingPrice);
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public Types getType() {
        return type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setType(Types type) {
        this.type = type;
    }

}
