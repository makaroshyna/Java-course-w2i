import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void run() {

        Task2 task2 = new Task2();

        assertFalse(task2.run(0));
        assertTrue(task2.run(85));
        assertFalse(task2.run(190));
    }
}