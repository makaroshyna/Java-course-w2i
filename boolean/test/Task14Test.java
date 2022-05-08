import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task14Test {

    @Test
    void run() {

        Task14 task14 = new Task14();

        assertFalse(task14.run(-2, 5, 2));
        assertTrue(task14.run(0, 6, -156));
    }
}