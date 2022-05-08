import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task27Test {

    @Test
    void run() {

        Task27 task27 = new Task27();

        Assertions.assertEquals(1, task27.run(31));
        Assertions.assertEquals(4, task27.run(13));
        Assertions.assertEquals(5, task27.run(77));
    }
}