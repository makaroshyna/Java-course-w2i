import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task50Test {

    @Test
    void run() {
        Task50 task50 = new Task50();

        String actual = "ALPHABET   BANANA  ALASKA THIS IS   THE TEST PAJAMA";
        String expected = "PAJAMA TEST THE IS THIS ALASKA BANANA ALPHABET";
        Assertions.assertEquals(expected, task50.run(actual));
    }
}