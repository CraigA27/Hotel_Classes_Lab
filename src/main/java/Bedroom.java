import java.util.ArrayList;

public class Bedroom extends Room {

private Double rate;


    public Bedroom(int capacity, int roomNumber, String type, Double rate) {
        super(capacity, type, roomNumber);
        this.rate = rate;
    }

    public Double getRate() {
        return rate;
    }
}
