package lib;

import java.util.Iterator;

/**
 * This utility class allows multiple classes to iterate over a text source in multiple ways.
 * 
 * It also serves to show how to implement an iterator
 */

public class TextIterable implements Iterable<String> {
    private String[] myStrings;

    /**
     * Create from a given string.
     */
    public TextIterable (String source, String regexp) {
        myStrings = source.split(regexp);
    }

    /**
     * @see java.lang.Iterator
     */
    @Override
    public Iterator<String> iterator () {
        return new Iterator<String>() {
            private int myCount = 0;

            @Override
            public boolean hasNext() {
                return myCount < myStrings.length;
            }

            @Override
            public String next() {
                String s = myStrings[myCount];
                myCount++;
                return s;
            }
        };
    }
}