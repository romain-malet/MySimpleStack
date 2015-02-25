package dcll.rmal;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Hello world!
 *
 */
public class SimpleStackImpl implements SimpleStack
{

    private Stack<Item> items;
    private int size;

    public SimpleStackImpl() {
        items = new Stack<Item>();
        size = 0;
    }

    @java.lang.Override
    public boolean isEmpty() {
        return false;
    }

    @java.lang.Override
    public int getSize() {
        return 0;
    }

    @java.lang.Override
    public void push(Item item) {

    }

    @java.lang.Override
    public Item peek() throws EmptyStackException {
        return null;
    }

    @java.lang.Override
    public Item pop() throws EmptyStackException {
        return null;
    }
}
