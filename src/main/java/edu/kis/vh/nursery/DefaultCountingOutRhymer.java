package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static int TOTAL = -1;
    public static int tab_size = 12;
    private int[] NUMBERS = new int[tab_size];

    public int total = TOTAL;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return TOTAL;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return TOTAL;
        return NUMBERS[total--];
    }

}
