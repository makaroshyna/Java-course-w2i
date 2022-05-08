import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void run() {
        Task2 task2 = new Task2();

        Assertions.assertEquals(3, task2.run(9, 3));
        Assertions.assertEquals(15, task2.run(219, 14));
        Assertions.assertEquals(452, task2.run(395500, 874));
    }
}