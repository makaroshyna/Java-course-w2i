import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task29Test {

    @Test
    void run() {
        Task29 task29 = new Task29();

        String actual = "123456123123";
        String inActual = "666";
        String expected = "126663456126663126663";
        Assertions.assertEquals(expected, task29.run('3', actual, inActual));
    }
}