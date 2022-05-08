import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task39Test {

    @Test
    void run() {
        Task39 task39 = new Task39();

        String actual = "That joke you told me was really funny";
        String expected = "joke";
        Assertions.assertEquals(expected, task39.run(actual));
    }
}