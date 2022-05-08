import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task20Test {

    @Test
    void run() {

        Task20 task20 = new Task20();

        Assertions.assertEquals(1, task20.run(5426));
        Assertions.assertEquals(3, task20.run(12548));
        Assertions.assertEquals(126, task20.run(456712));
    }
}