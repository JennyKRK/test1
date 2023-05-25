package example;

import static org.junit.Assert.*;

import example.Subject;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class SubjectTest {

    private Subject s1;

    @Before
    public void createOneSubject(){
    s1 = new Subject("english");
    }

    @Test
    public void isAverageCorrect(){
        s1.addANote(6);
        s1.addANote(4);
        Assert.assertEquals(5.0,5.0,0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void NoYouCannotGetASeven(){
        Subject s = new Subject("Chemistry");
        s.addANote(7);
    }

    @Test(expected = ArithmeticException.class)
    public void NoAverageFromEmptyList(){
        Subject s = new Subject("IT");
        s.averageNote();
    }


}