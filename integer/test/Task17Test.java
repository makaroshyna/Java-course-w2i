import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task17Test {

    @Test
    void run() {

        Task17 task17 = new Task17();

        Assertions.assertEquals(4, task17.run(188499));
        Assertions.assertEquals(1, task17.run(8100));
        Assertions.assertEquals(7, task17.run(8765));
    }
}