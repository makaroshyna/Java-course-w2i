import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @Test
    void run() {

        Task10 task10 = new Task10();

        assertFalse(task10.run(1, 1));
        assertTrue(task10.run(2, 3));
    }
}