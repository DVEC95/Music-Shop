import org.junit.Before;
import org.junit.Test;
import shop.MusicShop;
import shop.equipment.GuitarStrings;
import shop.instruments.Guitar;
import shop.interfaces.Types;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    Guitar guitar1;
    Guitar guitar2;
    GuitarStrings guitarStrings1;
    GuitarStrings guitarStrings2;

    @Before
    public void before(){
        musicShop = new MusicShop();

        guitar1 = new Guitar(
                "Fender",
                "Jazzmaster",
                250.00,
                650.00,
                "Alder",
                "Sunburst",
                Types.ELECTRIC,
                6,
                21);
        guitar2 = new Guitar(
                "Yamaha",
                "C40",
                85.00,
                130.00,
                "Rosewood",
                "Natural",
                Types.CLASSICAL,
                6,
                19
        );

        guitarStrings1 = new GuitarStrings(
                "Ernie Ball",
                "Super Slinky",
                1.20,
                5.99);
        guitarStrings2 = new GuitarStrings(
                "D'Addario",
                "EXL115",
                1.00,
                5.59);

        musicShop.addItem(guitar1);
        musicShop.addItem(guitar2);
        musicShop.addItem(guitarStrings1);
        musicShop.addItem(guitarStrings2);
    }

    @Test
    public void hasStock(){
        assertEquals(4, musicShop.getStock().size());
    }

    @Test
    public void canRemoveItem(){
        musicShop.removeItem(guitar1);
        assertEquals(3, musicShop.getStock().size());
    }

    @Test
    public void canCalculateTotalPotentialProfit(){
        assertEquals(454.38, musicShop.totalPotentialProfit(), 0.00);
    }

}
