
import java.util.List;

public class Main {

    public static void main(String[] args) {


    }
}
class House {
    private static int room_counter;
    private List<Room> rooms;
    private String address;
    private House(String address) {
        this.address = address;
    }

    public static House createHouse(String address) {
        return new House(address);

    }
    public void addRoom(Room room) {
        rooms.add(room);
        room_counter++;
    }
    public void addRoom(List<Room> newRooms) {
        rooms.addAll(newRooms);
        room_counter += newRooms.size();

    }
public static int getRoomCount() {
        return room_counter;
}



}
class Room {
    private String name;
    private double capacity;
    private List<Furniture> furnitures;

    public Room(String name, double capacity, List<Furniture> furnitures) {
        this.name = name;
        this.capacity = capacity;
        this.furnitures = furnitures;

    }
    public double getFurnituresPrice() {
        double sum = 0d;
        for (Furniture furniture : furnitures) {
            sum += furniture.getPriceIncludingVat();

        }
        return sum;

    }
}
class Furniture {
    private static final int vat_percentage = 22;
    private String name;
    private double price;

    public Furniture (String name, double price) {
        this.name = name;
        this. price = price;
    }
    public double getPrice() {
        return price;
    }
    public double getPriceIncludingVat () {
        double vatPrice = price * vat_percentage / 100;
        return price += vatPrice;


    }
 }
