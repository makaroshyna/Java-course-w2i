import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task32Test {

    @Test
    void run() {
        Task32 task32 = new Task32();

        String actual = "lets go with Legolas to the Going of goers in Chicago";
        String inActual = "go";
        Assertions.assertEquals(4, task32.run(actual, inActual));
    }
}