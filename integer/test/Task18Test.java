import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task18Test {

    @Test
    void run() {

        Task18 task18 = new Task18();

        Assertions.assertEquals(5, task18.run(65432));
        Assertions.assertEquals(7, task18.run(987654));
        Assertions.assertEquals(2, task18.run(2987));
    }
}