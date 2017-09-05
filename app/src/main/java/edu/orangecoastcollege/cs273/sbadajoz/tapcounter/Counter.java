package edu.orangecoastcollege.cs273.sbadajoz.tapcounter;


/**
 * Container of a count.  Keeps track of how many times an event has occurred.
 * @author Severiano Badajoz
 * @version 1.0
 */
public class Counter {
    private int mCount;

    /**
     * Constructs a new Counter with count at 0
     */
    public Counter() {
        mCount = 0;
    }

    /**
     * Increments the counter value by one then returns the new counter value.
     * @return The new value of the counter
     */
    public int incrementCount() {
        return ++mCount;
    }

    /**
     * Gets the current value of the counter
     * @return current value of the counter
     */
    public int getCount() {
        return mCount;
    }

    /**
     * Sets the new value of the counter
     * @param mCount The new value of the counter
     */
    public void setCount(int mCount) {
        this.mCount = mCount;
    }
}
