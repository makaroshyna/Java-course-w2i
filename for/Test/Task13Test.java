import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {

    @Test
    void run() {
        Task13 task13 = new Task13();

        Assertions.assertEquals(-0.4, task13.run(8));
        Assertions.assertEquals(1.3, task13.run(5));
    }
}