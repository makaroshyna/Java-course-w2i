import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task30Test {

    @Test
    void run() {
        Task30 task30 = new Task30();

        String actual = "This is the test";
        String inActual = "fuck";
        String expected = "Thisfuck isfuck the tesfuckt";
        Assertions.assertEquals(expected, task30.run('s', actual, inActual));
    }
}