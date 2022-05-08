import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task19Test {

    @Test
    void run() {
        Task19 task19 = new Task19();

        assertFalse(task19.run(2, 2, 7));
        assertTrue(task19.run(7, -7, 9));
        assertTrue(task19.run(8, -8, -8));
    }
}