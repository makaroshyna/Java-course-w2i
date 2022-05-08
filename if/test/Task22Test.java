import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task22Test {

    @Test
    void run() {
        Task22 task22 = new Task22();

        Assertions.assertEquals(1, task22.run(13, 2));
        Assertions.assertEquals(2, task22.run(-24, 1));
        Assertions.assertEquals(3, task22.run(-14, -24));
        Assertions.assertEquals(4, task22.run(24, -33));
    }
}