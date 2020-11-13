import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Room conferenceRoom;
    Room bedroom;
    Guest guest;
    Booking booking;

    @Before
    public void before(){
        hotel = new Hotel();
        conferenceRoom = new ConferenceRoom(20,"conf", 1);
    }

    @Test
    public void canCheckGuestIntoBedroom(){
        hotel.checkIn(guest, bedroom);
        Room returnedRoom = hotel.getRoom(bedroom);
        assertEquals(1, returnedRoom.currentGuests());
    }

    @Test
    public void canCreateBooking(){
        Booking booking = hotel.bookRoom(bedroom, 2);
        assertEquals(2, booking.getNoNights());
    }


}
