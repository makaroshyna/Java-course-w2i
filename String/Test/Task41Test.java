import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task41Test {

    @Test
    void run() {
        Task41 task41 = new Task41();

        String actual = "This is the  test of this program";
        Assertions.assertEquals(7, task41.run(actual));
    }
}