import org.junit.Before;
import org.junit.Test;
import shop.instruments.Guitar;
import shop.instruments.Piano;
import shop.interfaces.Types;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Guitar guitar;
    Piano piano;

    @Before
    public void before(){
        //guitar
        guitar = new Guitar(
                "Fender",
                "Jazzmaster",
                250.00,
                650.00,
                "Alder",
                "Sunburst",
                Types.ELECTRIC,
                6,
                21);

        //piano
        piano = new Piano(
                "Yamaha",
                "C7X",
                30000.00,
                42500.00,
                "Maple",
                "Ebony",
                Types.GRAND,
                88);
    }

    @Test
    public void canGetAttributes(){
        //guitar
        assertEquals("Fender", guitar.getManufacturer());
        assertEquals("Jazzmaster", guitar.getModel());
        assertEquals(250.00, guitar.getBuyingPrice(), 0.00);
        assertEquals(650.00, guitar.getSellingPrice(), 0.00);
        assertEquals("Alder", guitar.getMaterial());
        assertEquals("Sunburst", guitar.getColour());
        assertEquals("electric", guitar.getType().getTypeValue());
        assertEquals(6, guitar.getNumberOfStrings());
        assertEquals(21, guitar.getNumberOfFrets());

        //piano
        assertEquals("Yamaha", piano.getManufacturer());
        assertEquals("C7X", piano.getModel());
        assertEquals(30000.00, piano.getBuyingPrice(), 0.00);
        assertEquals(42500.00, piano.getSellingPrice(), 0.00);
        assertEquals("Maple", piano.getMaterial());
        assertEquals("Ebony", piano.getColour());
        assertEquals("grand", piano.getType().getTypeValue());
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canSetAttributes(){
        guitar.setManufacturer("Epiphone");
        guitar.setModel("DR-212");
        guitar.setBuyingPrice(120.00);
        guitar.setSellingPrice(220.00);
        guitar.setMaterial("Mahogany");
        guitar.setColour("Black");
        guitar.setType(Types.ACOUSTIC);
        guitar.setNumberOfStrings(12);
        guitar.setNumberOfFrets(20);

        assertEquals("Epiphone", guitar.getManufacturer());
        assertEquals("DR-212", guitar.getModel());
        assertEquals(120.00, guitar.getBuyingPrice(), 0.00);
        assertEquals(220.00, guitar.getSellingPrice(), 0.00);
        assertEquals("Mahogany", guitar.getMaterial());
        assertEquals("Black", guitar.getColour());
        assertEquals("acoustic", guitar.getType().getTypeValue());
        assertEquals(12, guitar.getNumberOfStrings());
        assertEquals(20, guitar.getNumberOfFrets());
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("You play the electric guitar.", guitar.play());
        assertEquals("You play the grand piano.", piano.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(400.00, guitar.calculateMarkup(), 0.00);
        assertEquals(12500.00, piano.calculateMarkup(), 0.00);
    }

}
