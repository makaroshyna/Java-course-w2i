import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task14Test {

    @Test
    void run() {

        Task14 task14 = new Task14();

        Assertions.assertEquals(310, task14.run(103));
        Assertions.assertEquals(542, task14.run(425));
        Assertions.assertEquals(612, task14.run(126));
    }
}