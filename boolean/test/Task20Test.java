import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task20Test {

    @Test
    void run() {
        Task20 task20 = new Task20();

        assertFalse(task20.run(220));
        assertTrue(task20.run(140));
    }
}