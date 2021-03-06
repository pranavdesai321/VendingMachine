package model;

public abstract class SpecialEntity {
    private int start, end;

    public SpecialEntity(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
    public abstract String getId();
}
