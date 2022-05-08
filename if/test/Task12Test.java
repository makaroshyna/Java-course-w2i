import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task12Test {

    @Test
    void run() {
        Task12 task12 = new Task12();

        Assertions.assertEquals(4, task12.run(25, 136, 4));
        Assertions.assertEquals(2, task12.run(1388, 2, 3));
        Assertions.assertEquals(5, task12.run(5, 177, 241));
    }
}