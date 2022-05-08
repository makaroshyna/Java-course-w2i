import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task33Test {

    @Test
    void run() {
        Task33 task33 = new Task33();

        String actual = "I am not gay";
        String substring = "not ";
        String expected = "I am gay";

        Assertions.assertEquals(expected, task33.run(actual, substring));

        actual = "I am not gay";
        substring = "actually ";
        expected = "I am not gay";

        Assertions.assertEquals(expected, task33.run(actual, substring));
    }
}