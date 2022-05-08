import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task30Test {

    @Test
    void run() {

        Task30 task30 = new Task30();

        Assertions.assertEquals(10, task30.run(998));
        Assertions.assertEquals(16, task30.run(1501));
        Assertions.assertEquals(21, task30.run(2061));
    }
}