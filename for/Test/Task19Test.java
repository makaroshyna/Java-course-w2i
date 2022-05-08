import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task19Test {

    @Test
    void run() {
        Task19 task19 = new Task19();

        Assertions.assertEquals(362880, task19.run(9));
        Assertions.assertEquals(479001600, task19.run(12));
    }
}