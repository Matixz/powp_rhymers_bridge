package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY = -1;
    private static final int MAX_SIZE = 11;
    public static final int STACK_CAPACITY = 12;
    private int[] numbers = new int[STACK_CAPACITY];

    public int total = -1;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == MAX_SIZE;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
