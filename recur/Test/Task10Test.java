import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @Test
    void run() {
        Task10 task10 = new Task10();

        Assertions.assertEquals(9, task10.run(9));
        Assertions.assertEquals(5, task10.run(1022));
    }
}