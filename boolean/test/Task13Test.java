import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {

    @Test
    void run() {

        Task13 task13 = new Task13();

        assertFalse(task13.run(-4, -134, -24));
        assertTrue(task13.run(0, 7, -31));
    }
}