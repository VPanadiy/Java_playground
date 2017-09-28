package HackerRank;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class Even_odd_ArrayTest {
    Even_odd_Array Even_odd;
    String arr;

    @Before
    public void setUp() throws Exception {
        Even_odd = new Even_odd_Array();
        System.out.println("before");
    }

    @Test
    public void even_odd1() throws Exception {
        arr = "assafsdf";
        String result = Even_odd.Even_odd(arr);
        assertEquals(result, "asfd sasf");
    }
    @Test
    public void even_odd2() throws Exception {
        String arr = "assafsdf1";
        String result = Even_odd.Even_odd(arr);
        assertEquals("Barada: ",result, "asfd1 sasf");
    }
    @Test
    public void even_odd3() throws Exception {
        String arr = "sfljslkfdjksld";
        String result = Even_odd.Even_odd(arr);
        assertEquals("Barada: ",result, "slskdkl fjlfjsd");
    }
    @After
    public void tearDown() throws Exception {
        System.out.println("ssssss1");
    }

}