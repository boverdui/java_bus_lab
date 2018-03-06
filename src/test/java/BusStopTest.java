import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person;

    @Before
    public void before(){
        busStop = new BusStop("Primrose St");
        person = new Person();
    }

    @Test
    public void queueStartsEmpty() {
        assertEquals(0, busStop.personCount());
    }

    @Test
    public void canAddPerson() {
        busStop.add(person);
        assertEquals(1, busStop.personCount());
    }

    @Test
    public void canRemovePerson() {
        busStop.add(person);
        assertEquals(1, busStop.personCount());
        busStop.remove();
        assertEquals(0, busStop.personCount());
    }

    @Test
    public void canGetBackAPerson() {
        busStop.add(person);
        assertEquals(1, busStop.personCount());
        assertEquals(person, busStop.remove());
    }

}
