import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task12Test {

    @Test
    void run() {

        Task12 task12 = new Task12();

        assertFalse(task12.run(-2, 0, 1));
        assertTrue(task12.run(1, 9293, 188));
    }
}