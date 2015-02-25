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
        return items.isEmpty();
    }

    @java.lang.Override
    public int getSize() {
        return items.size();
    }

    @java.lang.Override
    public void push(Item item) {
        items.push(item);
    }

    @java.lang.Override
    public Item peek() throws EmptyStackException {
        if (items.isEmpty())
            throw new EmptyStackException();
        else
            return items.peek();
    }

    @java.lang.Override
    public Item pop() throws EmptyStackException {
        if (items.isEmpty())
            throw new EmptyStackException();
        else
            return items.pop();
    }
}
