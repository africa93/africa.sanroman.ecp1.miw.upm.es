package africa.sanroman.ecp1.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C21Test {
    private C21 c;
    
    @Before
    public void test(){
        c = new C21();
    }
    @Test
    public void testM1() {
        assertEquals(c.m1(), "m1");
    }

    @Test
    public void testM2() {
        assertEquals(c.m2(), "m2");
    }
    
    @Test
    public void testM3() {
        assertEquals(c.m3(), "m3");
    }

}
