import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task26Test {

    @Test
    void run() {
        Task26 task26 = new Task26();

        assertFalse(task26.run(4, 0));
        assertTrue(task26.run(2, -3));
    }
}