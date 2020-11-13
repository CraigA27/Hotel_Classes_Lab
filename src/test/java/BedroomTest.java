import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Room bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(1,1, "bedroom", 50.00);
        guest = new Guest("Bob");
    }

    @Test
    public void canAddGuestToRoom(){
        this.bedroom.addGuestToRoom(guest);
        assertEquals(1, bedroom.currentGuests());
    }

    @Test
    public void canRemoveGuestFromRoom(){
        this.bedroom.addGuestToRoom(guest);
        this.bedroom.removeGuestFromRoom(guest);
        assertEquals(0, bedroom.currentGuests());
    }

    @Test public void canGetRate(){
        assertEquals(50.00, bedroom.getRate(), 0.01);
    }
}
