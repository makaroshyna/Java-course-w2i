import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void run() {
        Task4 task4 = new Task4();

        Assertions.assertEquals(1, task4.run(5, 4));
        Assertions.assertEquals(5, task4.run(213, 40));
        Assertions.assertEquals(9, task4.run(98, 10));
        Assertions.assertEquals(18, task4.run(18, 1));
        Assertions.assertEquals(132, task4.run(663, 5));
    }
}