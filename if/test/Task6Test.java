import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void run() {
        Task6 task6 = new Task6();

        Assertions.assertEquals(4, task6.run(0.325, 4));
        Assertions.assertEquals(359, task6.run(359, 58.2));
    }
}