package ch.nyp.xinnyi.bot.telegram.updatemodels;

public class Chat {
    private long id;
    private String type;
    private String title;
    private String username;
    private String first_name;
    private String last_name;

    public long getId() {
        return id;
    }

    public Chat setId(long id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public Chat setType(String type) {
        this.type = type;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Chat setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Chat setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getFirst_name() {
        return first_name;
    }

    public Chat setFirst_name(String first_name) {
        this.first_name = first_name;
        return this;
    }

    public String getLast_name() {
        return last_name;
    }

    public Chat setLast_name(String last_name) {
        this.last_name = last_name;
        return this;
    }
}
