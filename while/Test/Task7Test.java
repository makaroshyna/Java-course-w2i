import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void run() {
        Task7 task7 = new Task7();

        Assertions.assertEquals(5, task7.run(24));
        Assertions.assertEquals(9, task7.run(78));
        Assertions.assertEquals(17, task7.run(270));
    }
}