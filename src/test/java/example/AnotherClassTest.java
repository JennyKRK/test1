package example;

import junit.framework.TestCase;

public class AnotherClassTest extends TestCase {

    AnotherClass anotherClass;

    public void setUp(){
        anotherClass = new AnotherClass("memememe");
    }

    public void testGetName(){
        assertEquals(anotherClass.getName(),"memememe");
    }


}