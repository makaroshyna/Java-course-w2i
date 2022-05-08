import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task28Test {

    @Test
    void run() {

        Task28 task28 = new Task28();

        Assertions.assertEquals( 1, task28.run(2, 28));
        Assertions.assertEquals(4, task28.run(6, 20));
        Assertions.assertEquals(7, task28.run(1, 126));
    }
}