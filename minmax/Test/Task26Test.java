import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task26Test {

    @Test
    void run() {
        Task26 task26 = new Task26();

        int[] array = new int[] {15, 33, 546, 34, 3468, 1, 4, 2};
        Assertions.assertEquals(3, task26.run(8, array));

        array = new int[] {2, 5774, 468, 21, 461, 4592, 584, 758, 234};
        Assertions.assertEquals(4, task26.run(9, array));
    }
}