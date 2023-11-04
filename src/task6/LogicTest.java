package task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    @Test
    void checkTypicalMatrix() {
        assertArrayEquals(Logic.GetMatrix(new int[]{1,5,3,4,8}), new int[][]{{1,5,3,4,8}, {5,3,4,8,1}, {3,4,8,1,5}, {4,8,1,5,3}, {8,1,5,3,4}});
    }
    @Test
    void checkOneElement() {
        assertArrayEquals(Logic.GetMatrix(new int[]{7}), new int[][]{{7}});
    }
}