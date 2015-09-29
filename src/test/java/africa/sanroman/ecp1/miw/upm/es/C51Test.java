package africa.sanroman.ecp1.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C51Test {

private C51 c;
    
    @Before
    public void test(){
        c = new C51();
    }
    @Test
    public void testM1() {
        assertEquals(c.m1(), "m1");
    }

    @Test
    public void testM2() {
        assertEquals(c.m2(), "m2");
    }

}
