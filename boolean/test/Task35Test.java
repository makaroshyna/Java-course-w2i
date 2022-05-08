import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task35Test {

    @Test
    void run() {
        Task35 task35 = new Task35();

        assertFalse(task35.run(3, 5, 1, 4));
        assertTrue(task35.run(2, 5, 2, 1));
    }
}