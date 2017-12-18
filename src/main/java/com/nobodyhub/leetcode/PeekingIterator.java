package com.nobodyhub.leetcode;

import java.util.Iterator;

/**
 * @author Ryan
 * @since 18/12/2017
 */
public class PeekingIterator implements Iterator<Integer> {

    protected final Iterator<Integer> iterator;
    protected Integer curEle;
    protected Integer peekEle;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
        this.curEle = null;
        this.peekEle = this.iterator.next();

    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return peekEle;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        curEle = new Integer(peekEle);
        if (iterator.hasNext()) {
            this.peekEle = this.iterator.next();
        } else {
            this.peekEle = null;
        }
        return curEle;
    }

    @Override
    public boolean hasNext() {
        return null != peekEle;
    }
}
