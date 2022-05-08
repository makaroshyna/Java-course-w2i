import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {

    @Test
    void run() {
        Task9 task9 = new Task9();

        Assertions.assertEquals(6, task9.run(30, 72));
        Assertions.assertEquals(25, task9.run(50, 175));
    }
}