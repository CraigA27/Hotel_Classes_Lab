import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ConferenceTest{

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(20, "conference", 1);
        guest = new Guest("Bob");
    }

    @Test
    public void canAddGuestToRoom(){
        this.conferenceRoom.addGuestToRoom(guest);
        assertEquals(1, conferenceRoom.currentGuests());
    }
}