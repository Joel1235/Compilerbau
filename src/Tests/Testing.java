package Tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class Testing {

    @Test
    void TestExample() {
        example4tests test = new example4tests();
        int x = test.give1();
        assertEquals(1, x);
    }
}