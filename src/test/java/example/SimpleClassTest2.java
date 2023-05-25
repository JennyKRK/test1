package example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleClassTest2 {

    private SimpleClass simpleClass;

    @Before
    public void setUp() {
        simpleClass = new SimpleClass(1,0);
    }

    @Test
    public void testSimple1() {
        Assert.assertEquals(simpleClass.simpleAddition(),1);
    }

    @Test(expected = ArithmeticException.class)
    public void testSimple2(){
        simpleClass.simpleDivision();
    }
}