import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void run() {
        Task5 task5 = new Task5();

        Assertions.assertEquals(1, task5.run(7, 6));
        Assertions.assertEquals(3, task5.run(10, 7));
        Assertions.assertEquals(9, task5.run(180, 171));
        Assertions.assertEquals(37, task5.run(238098, 238061));
        Assertions.assertEquals(100, task5.run(1930194, 1930094));
    }
}