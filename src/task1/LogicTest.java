package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {
    @Test
    void checkFirstPair() {
        Logic test = new Logic();
        assertEquals(1.5, test.result(1,-1), 0.01);
    }

    @Test
    void checkSecondPair() {
        Logic test = new Logic();
        assertEquals(3.3, test.result(3,12), 0.1);

    }

    @Test
    void checkThirdPair(){
        Logic test = new Logic();
        assertEquals(5.286, test.result(5,6), 0.001);
    }
}