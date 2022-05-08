import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task23Test {

    @Test
    void run() {
        Task23 task23 = new Task23();

        Assertions.assertEquals(7, task23.run(21, 28));
        Assertions.assertEquals(24, task23.run(48, 72));
    }
}