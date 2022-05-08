import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task33Test {

    @Test
    void run() {
        Task33 task33 = new Task33();

        assertFalse(task33.run(29, 3, 9));
        assertTrue(task33.run(4, 5, 2));
    }
}