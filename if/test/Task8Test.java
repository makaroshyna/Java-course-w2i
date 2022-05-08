import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    void run() {
        Task8 task8 = new Task8();

        MyNumber expected = new MyNumber(4, 1);
        Assertions.assertEquals(expected, task8.run(1, 4));
        expected = new MyNumber(2535, 35);
        Assertions.assertEquals(expected, task8.run(2535, 35));
    }
}