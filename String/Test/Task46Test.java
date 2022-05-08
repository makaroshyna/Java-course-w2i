import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task46Test {

    @Test
    void run() {
        Task46 task46 = new Task46();

        String actual = "ALPHABET   BANANA  ALASKA THIS IS   THE TEST PAJAMA";
        Assertions.assertEquals(8, task46.run(actual));
    }
}