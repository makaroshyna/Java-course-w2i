import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task24Test {

    @Test
    void run() {
        Task24 task24 = new Task24();

        assertTrue(task24.run(1, -3, -2));
        assertFalse(task24.run(1, -3, 10));
        assertTrue(task24.run(1, -3, 1));
    }
}