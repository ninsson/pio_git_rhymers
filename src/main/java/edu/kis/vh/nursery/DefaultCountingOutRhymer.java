package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY_RHYMER_INDICATOR = -1;
    private static final int MAX_SIZE = 12;
    private final int[] NUMBERS = new int[MAX_SIZE];
    private int RET_VAL = -1;

    public int getTotal() {
        return total;
    }

    private int total = EMPTY_RHYMER_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == MAX_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return RET_VAL;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return RET_VAL;
        return NUMBERS[total--];
    }

}
