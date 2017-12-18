package com.nobodyhub.leetcode;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 18/12/2017
 */
public class PeekingIteratorTest {

    @Test
    public void test() {
        List<Integer> list = Lists.newArrayList(1, 2, 3);

        PeekingIterator solution = new PeekingIterator(list.iterator());
        assertEquals(new Integer(1), solution.next());
        assertEquals(new Integer(2), solution.peek());
        assertEquals(new Integer(2), solution.next());
        assertEquals(new Integer(3), solution.next());
        assertEquals(false, solution.hasNext());
    }

    @Test
    public void test1() {
        List<Integer> list = Lists.newArrayList(1, 2, 3, 4);

        PeekingIterator solution = new PeekingIterator(list.iterator());
        assertEquals(true, solution.hasNext());
        assertEquals(new Integer(1), solution.peek());
        assertEquals(new Integer(1), solution.peek());
        assertEquals(new Integer(1), solution.next());
        assertEquals(new Integer(2), solution.next());
        assertEquals(new Integer(3), solution.peek());
        assertEquals(new Integer(3), solution.peek());
        assertEquals(new Integer(3), solution.next());
        assertEquals(true, solution.hasNext());
        assertEquals(new Integer(4), solution.peek());
        assertEquals(true, solution.hasNext());
        assertEquals(new Integer(4), solution.next());
        assertEquals(false, solution.hasNext());


        assertEquals(false, solution.hasNext());
    }

}