package shop;

import shop.interfaces.ISell;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<ISell> stock;

    public MusicShop() {
        this.stock = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addItem(ISell item){
        this.stock.add(item);
    }

    public void removeItem(ISell item){
        this.stock.remove(item);
    }

    public double totalPotentialProfit() {
        double total = 0;
        for (ISell item : this.stock){
            total += item.calculateMarkup();
        }
        return total;
    }

}
