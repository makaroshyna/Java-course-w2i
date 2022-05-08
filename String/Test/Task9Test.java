import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {

    @Test
    void run() {
        Task9 task9 = new Task9();

        char c1 = 't';
        char c2 = '4';
        String expected = "t4t4t4t4t4t4t4t4t";

        Assertions.assertEquals(expected, task9.run(17, c1, c2));
    }
}