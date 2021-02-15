package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(21,2.1, 30.0);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isTallEnough(){
        visitor1.getHeight();
        visitor1.getAge();
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void isOldEnough(){
        visitor1.getAge();
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void hasNormalPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void hasSpecialPrice(){
        visitor1.getHeight();
        assertEquals(16.80, rollerCoaster.priceFor(visitor1),0.0);
    }
}
