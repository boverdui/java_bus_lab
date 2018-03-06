import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public int personCount() {
        return this.queue.size();
    }

    public void add(Person person) {
        this.queue.add(person);
    }

    public Person remove() {
       return this.queue.remove(0);

    }
}
