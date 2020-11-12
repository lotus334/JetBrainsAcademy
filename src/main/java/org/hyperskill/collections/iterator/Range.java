package org.hyperskill.collections.iterator;

import java.util.Iterator;

class Range implements Iterable<Long> {

    private long fromInclusive;
    private long toExclusive;

    public Range(long from, long to) {
        this.fromInclusive = from;
        this.toExclusive = to;
    }

    private class RangeIterator implements Iterator<Long> {
        private long cursor;

        public RangeIterator() {
            cursor = fromInclusive;
        }

        @Override
        public boolean hasNext() {
            return cursor < toExclusive;
        }

        @Override
        public Long next() {
            return cursor++;
        }
    }

    @Override
    public Iterator<Long> iterator() {
        return new RangeIterator();
    }
}
