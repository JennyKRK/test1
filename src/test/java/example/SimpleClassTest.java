package example;

import junit.framework.TestCase;

public class SimpleClassTest extends TestCase {

    SimpleClass simpleClass;
    SimpleClass simpleClass2;

    public void setUp() throws Exception {
        simpleClass = new SimpleClass(6,3);
        }

    public void testSimpleAddition() {
        assertEquals(simpleClass.simpleAddition(),9);
    }

    public void testSimpleDeduction(){
        assertEquals(simpleClass.simpleDeduction(),3);

    }

}