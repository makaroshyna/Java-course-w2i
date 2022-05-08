import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {

    @Test
    void run() {
        Task9 task9 = new Task9();

        Assertions.assertEquals(1, task9.run(100));
        Assertions.assertEquals(4, task9.run(493));
        Assertions.assertEquals(6, task9.run(673));
        Assertions.assertEquals(9, task9.run(911));
    }
}