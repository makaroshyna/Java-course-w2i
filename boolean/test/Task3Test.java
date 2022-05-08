import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void run() {

        Task3 task3 = new Task3();

        assertTrue(task3.run(0));
        assertFalse(task3.run(1));
        assertTrue(task3.run(98));
    }
}