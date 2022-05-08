import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task19Test {

    @Test
    void run() {
        Task19 task19 = new Task19();

        String actual = "3817";
        Assertions.assertEquals(1, task19.run(actual));

        actual = "347.385";
        Assertions.assertEquals(2, task19.run(actual));

        actual = "4.67.34";
        Assertions.assertEquals(0, task19.run(actual));
    }
}