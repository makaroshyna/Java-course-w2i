import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @org.junit.jupiter.api.Test
    void run() {
        Task4 task4 = new Task4();

        Task4Solution expected = new Task4Solution(8, 1.73);
        Assertions.assertEquals(expected, task4.run(2));
    }
}