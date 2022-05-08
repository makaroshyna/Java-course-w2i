import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {

    @Test
    void run() {
        Task13 task13 = new Task13();

        String actual = "123454321";
        assertTrue(task13.run(actual));
        actual = "1234567899887654321";
        assertFalse(task13.run(actual));
    }
}