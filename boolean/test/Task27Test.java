import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task27Test {

    @Test
    void run() {
        Task27 task27 = new Task27();

        assertFalse(task27.run(5, 6));
        assertTrue(task27.run(-4, -2));
        assertTrue(task27.run(-3, 7));
    }
}