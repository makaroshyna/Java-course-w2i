import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task37Test {

    @Test
    void run() {
        Task37 task37 = new Task37();

        String actual = "This is the test of the program";
        String s1 = "the";
        String s2 = "this";
        String expected = "This is the test of this program";
        Assertions.assertEquals(expected, task37.run(actual, s1, s2));
    }
}