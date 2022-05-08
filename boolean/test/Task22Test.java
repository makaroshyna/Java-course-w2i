import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task22Test {

    @Test
    void run() {
        Task22 task22 = new Task22();

        assertFalse(task22.run(718));
        assertTrue(task22.run(167));
        assertTrue(task22.run(842));
    }
}