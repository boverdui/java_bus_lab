import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {

        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();

    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void add(Person person) {
        if (this.passengers.size() < this.capacity) {
            passengers.add(person);
        }
    }

    public void remove(Person person) {
        this.passengers.remove(person);
    }


    public void pickUpPerson(BusStop busStop) {
        Person passenger = busStop.remove();
        add(passenger);
    }
}
