import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task11Test {

    @Test
    void run() {

        Task11 task11 = new Task11();

        assertFalse(task11.run(1, 2));
        assertTrue(task11.run(2, 2));
    }
}