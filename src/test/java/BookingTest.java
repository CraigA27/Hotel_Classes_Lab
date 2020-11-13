import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Room bedroom;
    Hotel hotel;
    Booking booking;

    @Before
    public void before(){
        bedroom = new Bedroom(1,2, "bedroom", 50.00);
//        hotel = new Hotel();
        booking  = new Booking(bedroom, 2);
    }

    @Test
    public void canGetCost(){
        assertEquals(100.00, booking.getCost(), 0.01);
    }

}
