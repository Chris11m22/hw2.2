package transport;

public enum Mass {
    N1(0,3.5f),
    N2(3.5f,12),
    N3(12,20),
    ;

    private float min;
    private float max;

    Mass(float min, float max) {
        this.min = min;
        this.max = max;
    }

    public float getMin() {
        return min;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public float getMax() {
        return max;
    }

    public void setMax(float max) {
        this.max = max;
    }
}
