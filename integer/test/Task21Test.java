import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task21Test {

    @Test
    void run() {

        Task21 task21 = new Task21();

        Assertions.assertEquals(1, task21.run(61));
        Assertions.assertEquals(11, task21.run(251));
        Assertions.assertEquals(20, task21.run(500));
    }
}