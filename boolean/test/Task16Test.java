import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task16Test {

    @Test
    void run() {
        Task16 task16 = new Task16();

        assertFalse(task16.run(1));
        assertFalse(task16.run(8));
        assertTrue(task16.run(18));
    }
}