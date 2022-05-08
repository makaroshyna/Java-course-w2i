import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task11Test {

    @Test
    void run() {
        Task11 task11 = new Task11();

        String actual = "Text to redact";
        String expected = "T e x t   t o   r e d a c t";
        Assertions.assertEquals(expected, task11.run(actual));
    }
}