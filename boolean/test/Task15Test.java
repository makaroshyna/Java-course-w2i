import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task15Test {

    @Test
    void run() {

        Task15 task15 = new Task15();

        assertFalse(task15.run(9, 1939, 1939));
        assertFalse(task15.run(-14, 9, -1449));
        assertTrue(task15.run(9, 3883, -148));
    }
}