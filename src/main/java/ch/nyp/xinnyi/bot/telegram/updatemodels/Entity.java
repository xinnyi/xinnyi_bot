package ch.nyp.xinnyi.bot.telegram.updatemodels;

public class Entity {
    private int offset;
    private int length;
    private String type;

    public long getOffset() {
        return offset;
    }

    public Entity setOffset(int offset) {
        this.offset = offset;
        return this;
    }

    public long getLength() {
        return length;
    }

    public Entity setLength(int length) {
        this.length = length;
        return this;
    }

    public String getType() {
        return type;
    }

    public Entity setType(String type) {
        this.type = type;
        return this;
    }
}
