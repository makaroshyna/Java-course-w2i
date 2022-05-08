import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task42Test {

    @Test
    void run() {
        Task42 task42 = new Task42();

        String actual = "THIST IS  THE  TEST OF THIS   PROGRAMP";
        Assertions.assertEquals(3, task42.run(actual));
    }
}