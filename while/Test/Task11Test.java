import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task11Test {

    @Test
    void run() {
        Task11 task11 = new Task11();

        Assertions.assertEquals(11, task11.run(66));
        Assertions.assertEquals(15, task11.run(118));
    }
}