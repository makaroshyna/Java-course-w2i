import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task15Test {

    @Test
    void run() {

        Task15 task15 = new Task15();

        Assertions.assertEquals(123, task15.run(213));
        Assertions.assertEquals(524, task15.run(254));
        Assertions.assertEquals(834, task15.run(384));
    }
}