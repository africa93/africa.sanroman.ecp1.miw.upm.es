package africa.sanroman.ecp1.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C11Test {

    private C11 c;
    @Before
    public void c11(){
        c = new C11();
    }

    @Test
    public void m1test() {
        assertEquals(c.m1(), "m1");
    }
    
    @Test
    public void m2test() {
        assertEquals(c.m2(), "m2");
    }

}
