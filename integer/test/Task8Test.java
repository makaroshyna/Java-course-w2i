import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    void run() {
        Task8 task8 = new Task8();

        Assertions.assertEquals(21, task8.run(12));
        Assertions.assertEquals(63, task8.run(36));
        Assertions.assertEquals(89, task8.run(98));
    }
}