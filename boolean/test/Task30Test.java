import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task30Test {

    @Test
    void run() {
        Task30 task30 = new Task30();

        assertFalse(task30.run(14, 14, 15));
        assertTrue(task30.run(3, 3, 3));
    }
}