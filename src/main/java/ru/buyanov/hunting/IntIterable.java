package ru.buyanov.hunting;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *  @author https://github.com/alex-on-java 03.02.2016
 */
public class IntIterable implements Iterable<Integer> {
    int[] backed;


    public IntIterable(int[] backed) {
        this.backed = backed;
    }

    public Iterator<Integer> iterator() {
        return new IntIterator();
    }

    private class IntIterator implements Iterator<Integer> {
        int i = 0;
        int size = backed.length;

        public boolean hasNext() {
            return i < size;
        }

        public Integer next() {
            if (i < size) {
                return backed[i++];
            }
            throw new NoSuchElementException("This element doesn't exist.");
        }

        public void remove() {
            throw new IllegalStateException("Could not remove from array");
        }
    }
}
