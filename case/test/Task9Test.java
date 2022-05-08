import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {

    @Test
    void run() {
        Task9 task9 = new Task9();

        MyNumber expected = new MyNumber(5, 2);
        Assertions.assertEquals(expected, task9.run(4, 2));

        expected = new MyNumber(1, 4);
        Assertions.assertEquals(expected, task9.run(31, 3));

        expected = new MyNumber(1, 3);
        Assertions.assertEquals(expected, task9.run(28, 2));

        expected = new MyNumber(1, 6);
        Assertions.assertEquals(expected, task9.run(30, 5));
    }
}