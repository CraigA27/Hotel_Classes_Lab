public class Booking {

    private Room bedroom;
    private int noNights;
    private Double cost;
    
    public Booking(Room bedroom, int noNights){
        this.bedroom = bedroom;
        this.noNights = noNights;
        this.cost = noNights * bedroom.getRate();
    }

    public Room getBedroom() {
        return bedroom;
    }

    public int getNoNights() {
        return noNights;
    }

    public Double getCost(){
        return cost;
    }
}
