import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task26Test {

    @Test
    void run() {
        Task26 task26 = new Task26();

        String actual = "123456789";
        String expected = "56789";
        Assertions.assertEquals(expected, task26.run(actual, 5));

        expected = "....123456789";
        Assertions.assertEquals(expected, task26.run(actual, 13));

        expected = "123456789";
        Assertions.assertEquals(expected, task26.run(actual, 9));
    }
}