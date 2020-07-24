import org.junit.Before;
import org.junit.Test;
import shop.equipment.GuitarStrings;

import static org.junit.Assert.assertEquals;

public class EquipmentTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings(
                "Ernie Ball",
                "Super Slinky",
                1.20,
                5.99);
    }

    @Test
    public void canGetAttributes(){
        assertEquals("Ernie Ball", guitarStrings.getManufacturer());
        assertEquals("Super Slinky", guitarStrings.getModel());
        assertEquals(1.20, guitarStrings.getBuyingPrice(), 0.00);
        assertEquals(5.99, guitarStrings.getSellingPrice(), 0.00);
    }

    @Test
    public void canSetAttributes(){
        guitarStrings.setManufacturer("D'Addario");
        guitarStrings.setModel("EXL115");
        guitarStrings.setBuyingPrice(1.00);
        guitarStrings.setSellingPrice(5.59);

        assertEquals("D'Addario", guitarStrings.getManufacturer());
        assertEquals("EXL115", guitarStrings.getModel());
        assertEquals(1.00, guitarStrings.getBuyingPrice(), 0.00);
        assertEquals(5.59, guitarStrings.getSellingPrice(), 0.00);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(4.79, guitarStrings.calculateMarkup(), 0.00);
    }

}
