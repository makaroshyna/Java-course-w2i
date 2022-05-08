import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void run() {
        Task6 task6 = new Task6();

        MyNumber expected = new MyNumber(1, 0);
        Assertions.assertEquals(expected, task6.run(10));
        expected = new MyNumber(2, 8);
        Assertions.assertEquals(expected, task6.run(28));
        expected = new MyNumber(7, 5);
        Assertions.assertEquals(expected, task6.run(75));
        expected = new MyNumber(9, 9);
        Assertions.assertEquals(expected, task6.run(99));
    }
}