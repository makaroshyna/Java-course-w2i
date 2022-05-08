import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void run() {
        Task3 task3 = new Task3();

        Assertions.assertEquals(0, task3.run(1000));
        Assertions.assertEquals(1, task3.run(1990));
        Assertions.assertEquals(5, task3.run(6001));
        Assertions.assertEquals(10, task3.run(11020));
        Assertions.assertEquals(120, task3.run(122999));
    }
}