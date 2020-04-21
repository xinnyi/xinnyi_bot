package ch.nyp.xinnyi.update;

public class User {
    private long id;
    private boolean is_bot;
    private String first_name;
    private String language_code;

    public long getId() {
        return id;
    }

    public User setId(long id) {
        this.id = id;
        return this;
    }

    public boolean isIs_bot() {
        return is_bot;
    }

    public User setIs_bot(boolean is_bot) {
        this.is_bot = is_bot;
        return this;
    }

    public String getFirst_name() {
        return first_name;
    }

    public User setFirst_name(String first_name) {
        this.first_name = first_name;
        return this;
    }

    public String getLanguage_code() {
        return language_code;
    }

    public User setLanguage_code(String language_code) {
        this.language_code = language_code;
        return this;
    }
}
