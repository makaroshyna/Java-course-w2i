import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void run() {
        Task4 task4 = new Task4();

        Assertions.assertEquals(0, task4.run(-414, -234, -2));
        Assertions.assertEquals(1, task4.run(-324, 1, -24));
        Assertions.assertEquals(2, task4.run(151, -255, 2));
        Assertions.assertEquals(3, task4.run(2324, 13, 24));
    }
}