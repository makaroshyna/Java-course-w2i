import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task32Test {

    @Test
    void run() {
        Task32 task32 = new Task32();

        assertFalse(task32.run(3, 2, 4));
        assertTrue(task32.run(21, 28, 35));
    }
}