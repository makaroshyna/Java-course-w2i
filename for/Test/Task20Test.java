import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task20Test {

    @Test
    void run() {
        Task20 task20 = new Task20();

        Assertions.assertEquals(153, task20.run(5));
        Assertions.assertEquals(46233, task20.run(8));
    }
}