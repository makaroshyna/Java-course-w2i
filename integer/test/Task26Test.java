import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task26Test {

    @Test
    void run() {

        Task26 task26 = new Task26();

        Assertions.assertEquals(2, task26.run(22));
        Assertions.assertEquals(4, task26.run(73));
        Assertions.assertEquals(7, task26.run(160));
    }
}