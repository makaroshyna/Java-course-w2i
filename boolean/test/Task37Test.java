import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task37Test {

    @Test
    void run() {
        Task37 task37 = new Task37();

        assertFalse(task37.run(3, 1, 6, 5));
        assertTrue(task37.run(1, 1, 2, 1));
        assertTrue(task37.run(5, 2, 5, 1));
        assertTrue(task37.run(5, 2, 6, 1));
    }
}