import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void run() {
        Task2 task2 = new Task2();

        Assertions.assertEquals(0, task2.run(180));
        Assertions.assertEquals(2, task2.run(2019));
        Assertions.assertEquals(23, task2.run(23100));
        Assertions.assertEquals(183, task2.run(183999));
        Assertions.assertEquals(8983, task2.run(8983322));
    }
}