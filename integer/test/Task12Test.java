import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task12Test {

    @Test
    void run() {

        Task12 task12 = new Task12();

        Assertions.assertEquals(321, task12.run(123));
        Assertions.assertEquals(823, task12.run(328));
        Assertions.assertEquals(43, task12.run(340));
    }
}