import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task34Test {

    @Test
    void run() {
        Task34 task34 = new Task34();

        assertFalse(task34.run(2, 4));
        assertTrue(task34.run(3, 6));
    }
}