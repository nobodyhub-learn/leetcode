package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 07/12/2017
 */
public class AllOneTest {

    @Test
    public void test0() {
        AllOne obj = new AllOne();
        assertEquals("", obj.getMaxKey());
        assertEquals("", obj.getMinKey());
    }

    @Test
    public void test1() {
        AllOne obj = new AllOne();
        obj.inc("key1");
        obj.dec("key1");
        assertEquals("", obj.getMaxKey());
        assertEquals("", obj.getMinKey());
    }

    @Test
    public void test2() {
        AllOne obj = new AllOne();
        obj.inc("key1");
        obj.dec("key2");
        assertEquals("key1", obj.getMaxKey());
        assertEquals("key1", obj.getMinKey());
    }

    @Test
    public void test3() {
        AllOne obj = new AllOne();
        obj.inc("hello");
        obj.inc("hello");
        assertEquals("hello", obj.getMaxKey());
        assertEquals("hello", obj.getMinKey());
        obj.inc("leet");
        assertEquals("hello", obj.getMaxKey());
        assertEquals("leet", obj.getMinKey());
    }

    @Test
    public void test4() {
        AllOne obj = new AllOne();
        obj.inc("a");
        obj.inc("b");
        obj.inc("b");
        obj.inc("c");
        obj.inc("c");
        obj.inc("c");
        obj.dec("b");
        obj.dec("b");
        assertEquals("a", obj.getMinKey());
        obj.dec("a");
        assertEquals("c", obj.getMaxKey());
        assertEquals("c", obj.getMinKey());
    }
}