import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task26Test {

    @Test
    void run() {
        Task26 task26 = new Task26();

        Assertions.assertEquals(2858, task26.run(-2858));
        Assertions.assertEquals(0, task26.run(0));
        Assertions.assertEquals(1, task26.run(1));
        Assertions.assertEquals(0.36, task26.run(0.6));
        Assertions.assertEquals(4, task26.run(2));
        Assertions.assertEquals(4, task26.run(818));
    }
}