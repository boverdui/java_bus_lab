import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Ocean Terminal", 2);
        person = new Person();
        busStop = new BusStop("Primrose St");
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPersonBelowCapacity() {
        bus.add(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void cannnotAddPersonAtCapacity() {
        bus.add(person);
        bus.add(person);
        bus.add(person);
        assertEquals(2, bus.passengerCount());
    }

    @Test
    public void canRemovePerson() {
        bus.add(person);
        assertEquals(1, bus.passengerCount());
        bus.remove(person);
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canPickupPerson() {
        busStop.add(person);
        assertEquals(1, busStop.personCount());
        bus.pickUpPerson(busStop);
        assertEquals(0, busStop.personCount());
        assertEquals(1, bus.passengerCount());
    }

}
