import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task17Test {

    @Test
    void run() {
        Task17 task17 = new Task17();

        assertFalse(task17.run(0));
        assertFalse(task17.run(19));
        assertTrue(task17.run(189));
    }
}