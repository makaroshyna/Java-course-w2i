import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    void run() {

        Task8 task8 = new Task8();

        assertFalse(task8.run(8, 4));
        assertTrue(task8.run(9, 3));
    }
}