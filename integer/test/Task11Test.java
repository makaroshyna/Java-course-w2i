import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class Task11Test {

    @org.junit.jupiter.api.Test
    void run() {

        Task11 task11 = new Task11();

        MyNumber expected = new MyNumber(6, 6);
        Assertions.assertEquals(expected, task11.run(123));
        expected = new MyNumber(12, 48);
        Assertions.assertEquals(expected, task11.run(462));
        expected = new MyNumber(4, 0);
        Assertions.assertEquals(expected, task11.run(103));
    }
}