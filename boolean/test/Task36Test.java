import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task36Test {

    @Test
    void run() {
        Task36 task36 = new Task36();

        assertFalse(task36.run(1, 4, 3, 2));
        assertTrue(task36.run(5, 2, 2, 2));
    }
}