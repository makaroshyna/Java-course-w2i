import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task12Test {

    @Test
    void run() {
        Task12 task12 = new Task12();

        Assertions.assertEquals(11, task12.run(67));
        Assertions.assertEquals(15, task12.run(125));
    }
}