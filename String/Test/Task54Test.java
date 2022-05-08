import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task54Test {

    @Test
    void run() {
        Task54 task54 = new Task54();

        String actual = "This is the test of this program";
        Assertions.assertEquals(8, task54.run(actual));
    }
}