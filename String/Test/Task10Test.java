import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @Test
    void run() {
        Task10 task10 = new Task10();

        String actual = "This text";
        String expected = "txet sihT";
        Assertions.assertEquals(expected, task10.run(actual));
    }
}