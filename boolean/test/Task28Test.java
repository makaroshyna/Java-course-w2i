import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task28Test {

    @Test
    void run() {
        Task28 task28 = new Task28();

        assertFalse(task28.run(-1, 0));
        assertTrue(task28.run(1, 3));
        assertTrue(task28.run(3, -14));
    }
}