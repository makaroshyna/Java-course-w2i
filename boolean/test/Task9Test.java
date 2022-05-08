import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {

    @Test
    void run() {

        Task9 task9 = new Task9();

        assertFalse(task9.run(2, 4));
        assertTrue(task9.run(3, 2));
    }
}