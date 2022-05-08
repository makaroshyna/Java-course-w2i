import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void run() {
        Task4 task4 = new Task4();

        assertFalse(task4.run(25));
        assertTrue(task4.run(81));
        assertTrue(task4.run(59049));
    }
}