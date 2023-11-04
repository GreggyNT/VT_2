package task2;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {
    @Test
    void checkRightDown() {
        Logic test = new Logic();
        assertTrue(test.checkIfIn(new Point(1,-1)));
    }

    @Test
    void checkRightUp() {
        Logic test = new Logic();
        assertTrue(test.checkIfIn(new Point(4,4)));
    }

    @Test
    void checkCenter() {
        Logic test = new Logic();
        assertTrue(test.checkIfIn(new Point(0,0)));
    }

    @Test
    void checkOutOfRectangle() {
        Logic test = new Logic();
        assertFalse(test.checkIfIn(new Point(5,10)));
    }

}