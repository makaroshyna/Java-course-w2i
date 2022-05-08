import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task31Test {

    @Test
    void run() {
        Task31 task31 = new Task31();

        assertFalse(task31.run(5, 6, 4));
        assertTrue(task31.run(3, 4, 3));
    }
}