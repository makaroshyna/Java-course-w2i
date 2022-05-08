import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void testRun() {
        Task1 task1 = new Task1();

        Assertions.assertEquals(2, task1.run(8, 3));
        Assertions.assertEquals(18, task1.run(318, 20));
    }
}