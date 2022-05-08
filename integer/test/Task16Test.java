import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task16Test {

    @Test
    void run() {

        Task16 task16 = new Task16();

        Assertions.assertEquals(153, task16.run(135));
        Assertions.assertEquals(482, task16.run(428));
        Assertions.assertEquals(883, task16.run(838));
    }
}