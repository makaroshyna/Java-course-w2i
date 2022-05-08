import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task12Test {

    @Test
    void run() {
        Task12 task12 = new Task12();

        Assertions.assertEquals(9.801792, task12.run(7));
        Assertions.assertEquals(33.52212864, task12.run(9));
    }
}