import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {

    @Test
    void run() {

        Task13 task13 = new Task13();

        Assertions.assertEquals(312, task13.run(231));
        Assertions.assertEquals(251, task13.run(125));
        Assertions.assertEquals(798, task13.run(879));
    }
}