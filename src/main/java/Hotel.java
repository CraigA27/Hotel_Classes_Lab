import java.awt.print.Book;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;
//    private ArrayList<Booking> bookings;

    public Hotel() {
        this.rooms = new ArrayList<Room>();
//        this.bookings = new ArrayList<Booking>();
    }
    
    public void addRoom(Room room){
        this.rooms.add(room);
    }

    public void checkIn(Guest guest, Room roomToCheckin){
        for(Room room: rooms){
            if (room.getType().equals(roomToCheckin.getType())){
                if (room.getRoomNumber() == roomToCheckin.getRoomNumber()){
                    room.addGuestToRoom(guest);
                }
            }
            
        }
        
    }
    
    public Room getRoom(Room roomToCheck){
        for (Room room: rooms){
            if (room.getType().equals(roomToCheck.getType())){
                if (room.getRoomNumber() == roomToCheck.getRoomNumber()){
                    return room;
                }
            }
        }
        return null;
    }

    public Booking bookRoom(Room bedroom, int noNights){
        Booking booking = new Booking(bedroom, noNights);
        return booking;

    }

}
