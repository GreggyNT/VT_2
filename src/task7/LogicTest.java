package task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {
    @Test
    void checkFirsSrtingt() {
        assertArrayEquals(Logic.calculate(new double[]{1,5,3,4,8}), new double[]{1,3,4,5,8});
    }
    @Test
    void checkReverseSorting() {
        assertArrayEquals(Logic.calculate(new double[]{5,4,3,2,1}), new double[]{1,2,3,4,5});
    }

}