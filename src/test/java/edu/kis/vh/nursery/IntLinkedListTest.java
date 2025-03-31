package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListTest {
    @Test
    public void testPush() {
        IntLinkedList list = new IntLinkedList();
        list.push(5);
        Assert.assertEquals(5, list.top());
    }

    @Test
    public void testPop() {
        IntLinkedList list = new IntLinkedList();
        list.push(5);
        Assert.assertEquals(5, list.pop());
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertTrue(list.isEmpty());
        list.push(5);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testIsFull() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertFalse(list.isFull());
    }
}
