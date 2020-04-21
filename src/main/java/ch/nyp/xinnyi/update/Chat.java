package ch.nyp.xinnyi.update;

public class Chat {
    private long id;
    private String first_name;
    private String type;

    public long getId() {
        return id;
    }

    public Chat setId(long id) {
        this.id = id;
        return this;
    }

    public String getFirst_name() {
        return first_name;
    }

    public Chat setFirst_name(String first_name) {
        this.first_name = first_name;
        return this;
    }

    public String getType() {
        return type;
    }

    public Chat setType(String type) {
        this.type = type;
        return this;
    }
}
