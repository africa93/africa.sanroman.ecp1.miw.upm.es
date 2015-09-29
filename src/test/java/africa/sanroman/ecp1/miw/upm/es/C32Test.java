package africa.sanroman.ecp1.miw.upm.es;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C32Test {
    private C32 c;
    @Before
    public void c32(){
        c = new C32();
    }
    @Test
    public void testMA() {
        assertEquals(c.mA(), "mA");
    }
}
