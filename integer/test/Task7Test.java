import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void run() {
        Task7 task7 = new Task7();

        MyNumber expected = new MyNumber(1, 1);
        Assertions.assertEquals(expected, task7.run(10));
        expected = new MyNumber(11, -7);
        Assertions.assertEquals(expected, task7.run(29));
        expected = new MyNumber(8, 6);
        Assertions.assertEquals(expected, task7.run(71));
        expected = new MyNumber(18, 0);
        Assertions.assertEquals(expected, task7.run(99));
    }
}