import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private int roomNumber;

    public Room(int capacity, String type, int roomNumber) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.type = type;
        this.roomNumber = roomNumber;
    }

    public void addGuestToRoom(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuestFromRoom(Guest guest){
        this.guests.remove(guest);
    }

    public int currentGuests(){
        return guests.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
