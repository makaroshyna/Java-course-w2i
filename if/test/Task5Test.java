import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void run() {
        Task5 task5 = new Task5();

        MyNumber expected = new MyNumber(0, 3);
        Assertions.assertEquals(expected, task5.run(-143, -2, -255));
        expected = new MyNumber(1, 2);
        Assertions.assertEquals(expected, task5.run(52, -143, -35));
        expected = new MyNumber(2, 1);
        Assertions.assertEquals(expected, task5.run(-25, 235, 34));
        expected = new MyNumber(3, 0);
        Assertions.assertEquals(expected, task5.run(2484, 24, 3));
    }
}