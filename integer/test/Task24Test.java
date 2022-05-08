import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task24Test {

    @Test
    void run() {

        Task24 task24 = new Task24();

        Assertions.assertEquals(2, task24.run(16));
        Assertions.assertEquals(1, task24.run(29));
        Assertions.assertEquals(5, task24.run(250));
    }
}