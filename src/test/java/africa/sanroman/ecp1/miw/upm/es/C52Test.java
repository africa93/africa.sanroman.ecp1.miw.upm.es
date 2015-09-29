package africa.sanroman.ecp1.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C52Test {


    private C52 c;
    @Before
    public void c52(){
        c = new C52();
    }
    @Test
    public void testMA() {
        assertEquals(c.mA(), "mA");
    }


}
