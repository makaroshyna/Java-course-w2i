import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task23Test {

    @Test
    void run() {
        Task23 task23 = new Task23();

        assertFalse(task23.run(1234));
        assertTrue(task23.run(8778));
    }
}