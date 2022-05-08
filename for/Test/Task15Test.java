import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task15Test {

    @Test
    void run() {
        Task15 task15 = new Task15();

        Assertions.assertEquals(3125, task15.run(5, 5));
        Assertions.assertEquals(7.59375, task15.run(1.5, 5));
    }
}