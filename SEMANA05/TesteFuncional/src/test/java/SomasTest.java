import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomasTest {

    Somas s = new Somas();

    @Test
    public void ct1(){
        assertEquals(2, s.soma2(1,1));
    }
}
