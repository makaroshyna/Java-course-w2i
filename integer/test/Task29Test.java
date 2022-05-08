import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task29Test {

    @Test
    void run() {

        Task29 task29 = new Task29();

        MyNumber expected = new MyNumber(2, 0);
        Assertions.assertEquals(expected, task29.run(2, 4, 2));
        expected = new MyNumber(6, 11);
        Assertions.assertEquals(expected, task29.run(5, 7, 2));
    }
}