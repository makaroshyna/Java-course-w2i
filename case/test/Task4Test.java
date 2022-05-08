import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @org.junit.jupiter.api.Test
    void run() {
        Task4 task4 = new Task4();

        Assertions.assertEquals(31, task4.run(8));
        Assertions.assertEquals(30, task4.run(4));
        Assertions.assertEquals(28, task4.run(2));
    }
}