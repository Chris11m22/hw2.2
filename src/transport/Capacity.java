package transport;

public enum Capacity {
    EXTRA_SMALL(0, 10),
    SMALL(0, 25),
    MIDDLE(40, 50),
    BIG(60, 80),
    EXTRA_BIG(100, 120);

    private int min;
    private int max;

    Capacity(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
