import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void run() {

        Task6 task6 = new Task6();

        assertFalse(task6.run(6, 5, 4));
        assertTrue(task6.run(1, 2, 3));
    }
}