import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @org.junit.jupiter.api.Test
    void run() {
        Task1 task1 = new Task1();

        Assertions.assertEquals(3, task1.run(2));
        Assertions.assertEquals(-18383, task1.run(-18383));
        Assertions.assertEquals(2993, task1.run(2992));
    }
}