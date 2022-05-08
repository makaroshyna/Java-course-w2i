import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task22Test {

    @Test
    void run() {
        Task22 task22 = new Task22();

        assertFalse(task22.run(30));
        assertTrue(task22.run(29));
        assertTrue(task22.run(149));
    }
}