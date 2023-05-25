package example;

import org.junit.Test;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.assertEquals;

public class AnotherClassTest2 {

    @Test
    public void testAddAll(){
        SimpleClass simpleClass1 = mock(SimpleClass.class);
        AnotherClass anotherClass = new AnotherClass("me");
        expect(simpleClass1.simpleAddition()).andReturn(10);
        replay(simpleClass1);
        anotherClass.addSimpleClass(simpleClass1);
        assertEquals(anotherClass.addAll(),10);
        verify(simpleClass1);
    }

    @Test
    public void testAddAll2(){
        SimpleClass simpleClass2 = mock(SimpleClass.class);
        SimpleClass simpleClass3 = mock(SimpleClass.class);
        AnotherClass anotherClass2 = new AnotherClass("kokoko");
        expect(simpleClass2.simpleAddition()).andReturn(15);
        expect(simpleClass3.simpleAddition()).andReturn(10);
        replay(simpleClass2, simpleClass3);
        anotherClass2.addSimpleClass(simpleClass2);
        anotherClass2.addSimpleClass(simpleClass3);
        assertEquals(anotherClass2.addAll(),25);
        verify(simpleClass2);
        verify(simpleClass3);
    }
}







