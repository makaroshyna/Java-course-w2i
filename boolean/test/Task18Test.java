import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task18Test {

    @Test
    void run() {
        Task18 task18 = new Task18();

        assertFalse(task18.run(2, 4, 1));
        assertTrue(task18.run(2, 2, 2));
        assertTrue(task18.run(2, 2, 6));
    }
}