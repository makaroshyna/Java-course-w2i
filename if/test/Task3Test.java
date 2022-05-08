import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void run() {
        Task3 task3 = new Task3();

        Assertions.assertEquals(6, task3.run(5));
        Assertions.assertEquals(-39, task3.run(-37));
        Assertions.assertEquals(10, task3.run(0));
    }
}