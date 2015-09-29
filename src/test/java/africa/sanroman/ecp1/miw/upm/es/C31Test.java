package africa.sanroman.ecp1.miw.upm.es;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class C31Test {
private C31 c;
    
    @Before
    public void test(){
        c = new C31();
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
    public void testMB() {
        assertEquals(c.mB(), "mB");
    }

}
