import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task40Test {

    @Test
    void run() {
        Task40 task40 = new Task40();

        assertFalse(task40.run(1, 1, 5, 5));
        assertTrue(task40.run(1, 1, 2, 3));
        assertTrue(task40.run(3, 3, 2, 1));
    }
}