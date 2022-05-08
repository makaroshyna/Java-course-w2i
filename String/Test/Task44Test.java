import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task44Test {

    @Test
    void run() {
        Task44 task44 = new Task44();

        String actual = "ALPHABET   BANANA  ALASKA THIS IS   THE TEST PAJAMA";
        Assertions.assertEquals(3, task44.run(actual));
    }
}