import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void run() {

        Task4 task4 = new Task4();

        assertFalse(task4.run(0, 4));
        assertFalse(task4.run(3, 4));
        assertFalse(task4.run(2, 3));
        assertTrue(task4.run(3, 3));
        assertTrue(task4.run(4, 2));
    }
}