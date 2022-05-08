import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task29Test {

    @Test
    void run() {
        Task29 task29 = new Task29();

        assertFalse(task29.run(3, 4, 4, 2, 8, -5));
        assertTrue(task29.run(1, 1, -2, 3, 4, -2));
    }
}