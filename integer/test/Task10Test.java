import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @Test
    void run() {

        Task10 task10 = new Task10();

        MyNumber expected = new MyNumber(7, 1);
        Assertions.assertEquals(expected, task10.run(117));
        expected = new MyNumber(2, 1);
        Assertions.assertEquals(expected, task10.run(612));
        expected = new MyNumber(0, 5);
        Assertions.assertEquals(expected, task10.run(350));
    }
}