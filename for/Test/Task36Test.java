import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task36Test {

    @Test
    void run() {
        Task36 task36 = new Task36();

        Assertions.assertEquals(4425, task36.run(5, 5));
        Assertions.assertEquals(385, task36.run(10, 2));
    }
}