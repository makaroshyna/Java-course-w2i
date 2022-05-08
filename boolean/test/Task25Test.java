import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task25Test {

    @Test
    void run() {
        Task25 task25 = new Task25();

        assertFalse(task25.run(-9, 0));
        assertTrue(task25.run(-1, 2));
    }
}