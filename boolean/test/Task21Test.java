import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task21Test {

    @Test
    void run() {
        Task21 task21 = new Task21();

        assertFalse(task21.run(155));
        assertTrue(task21.run(189));
    }
}