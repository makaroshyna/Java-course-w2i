import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task25Test {

    @Test
    void run() {
        Task25 task25 = new Task25();

        Assertions.assertEquals(4, task25.run(15));
        Assertions.assertEquals(0, task25.run(18));
        Assertions.assertEquals(2, task25.run(27));
    }
}