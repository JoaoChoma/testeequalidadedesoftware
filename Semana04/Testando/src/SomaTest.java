import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomaTest {
    @Test
    void getNum1() {
        Soma s = new Soma(1,2);
        assertEquals(1, s.getNum1());
    }

    @Test
    void getNum2() {
        Soma s = new Soma(1,2);
        assertEquals(2, s.getNum2());
    }

    @Test
    void somar(){
        Soma s = new Soma(1,2);
        assertEquals(3, s.somar());
    }
}