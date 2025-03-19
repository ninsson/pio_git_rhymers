package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int TOTAL = -1;
    public static final int tab_size = 12;
    private final int[] NUMBERS = new int[tab_size];
    public int RET_VAL = -1;

    public int total = TOTAL;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL;
    }

    public boolean isFull() {
        return total == tab_size - 1;
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
