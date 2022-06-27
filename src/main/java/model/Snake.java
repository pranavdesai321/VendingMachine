package model;

public class Snake extends SpecialEntity {

    public Snake(int start, int end) {
        super(start, end);
    }

    @Override
    public String getId() {
        return "S_" + this.getEnd();
    }
}
