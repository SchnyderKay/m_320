import static org.junit.Assert.assertEquals;

public class Test {
    public static void main(String[] args) {
        Time time = new Time(12, 3, 45);

        // tests
        assertEquals(12, time.getHour());
        assertEquals(3, time.getMinute());
        assertEquals(45, time.getSecond());
        assertEquals("12:03:45", time.toString());
    }
}


