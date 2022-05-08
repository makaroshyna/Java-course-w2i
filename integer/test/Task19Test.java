import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task19Test {

    @Test
    void run() {

        Task19 task19 = new Task19();

        Assertions.assertEquals(1, task19.run(60));
        Assertions.assertEquals(8, task19.run(482));
        Assertions.assertEquals(26, task19.run(1578));
    }
}