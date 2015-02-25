package dcll.rmal;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Before;

/**
 * Unit test for simple SimpleStackImpl.
 */
public class SimpleStackImplTest {

    private Item item;
    private SimpleStackImpl stack;

    @Before
    public void setUp() {
        stack = new SimpleStackImpl();
        item = new Item();
    }

    @org.junit.Test
    public void testIsEmptyTrue() {
        Assert.assertTrue(stack.isEmpty());
    }

    @org.junit.Test
    public void testIsEmptyFalse() {
        stack.push(item);
        Assert.assertFalse(stack.isEmpty());
    }

    @org.junit.Test
    public void testGetSizeEmpty() {
        Assert.assertEquals(0, stack.getSize());
    }

    @org.junit.Test
    public void testGetSizeNotEmpty() {
        stack.push(item);
        Assert.assertEquals(1, stack.getSize());
    }

    @org.junit.Test
    public void testPush() throws EmptyStackException {
        Assert.assertEquals(0, stack.getSize());
        stack.push(item);
        Assert.assertEquals(1, stack.getSize());
        Assert.assertEquals(item, stack.peek());
    }

    @org.junit.Test
    public void testPeekNotEmptyStack() throws EmptyStackException {
        stack.push(item);
        Assert.assertEquals(item, stack.peek());
        Assert.assertEquals(1, stack.getSize());
    }

    @org.junit.Test(expected=EmptyStackException.class)
    public void testPeekEmptyStack() throws EmptyStackException {
        Item none = stack.peek();
    }

    @org.junit.Test
    public void testPopNotEmptyStack() throws EmptyStackException {
        stack.push(item);
        Assert.assertEquals(item, stack.pop());
        Assert.assertEquals(0, stack.getSize());
        Assert.assertTrue(stack.isEmpty());
    }

    @org.junit.Test(expected=EmptyStackException.class)
    public void testPopEmptyStack() throws EmptyStackException {
        Item none = stack.pop();
    }

}
