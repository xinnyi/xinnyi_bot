package ch.nyp.xinnyi.dto.update;

import ch.nyp.xinnyi.Dto;

public class User {

    private long id;
    private boolean is_bot;
    private String first_name;
    private String last_name;
    private String username;
    private String language_code;
    private boolean can_join_groups;
    private boolean can_read_all_group_messages;
    private boolean supports_inline_queries;


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

    public String getLast_name() {
        return last_name;
    }

    public User setLast_name(String last_name) {
        this.last_name = last_name;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getLanguage_code() {
        return language_code;
    }

    public User setLanguage_code(String language_code) {
        this.language_code = language_code;
        return this;
    }

    public boolean isCan_join_groups() {
        return can_join_groups;
    }

    public User setCan_join_groups(boolean can_join_groups) {
        this.can_join_groups = can_join_groups;
        return this;
    }

    public boolean isCan_read_all_group_messages() {
        return can_read_all_group_messages;
    }

    public User setCan_read_all_group_messages(boolean can_read_all_group_messages) {
        this.can_read_all_group_messages = can_read_all_group_messages;
        return this;
    }

    public boolean isSupports_inline_queries() {
        return supports_inline_queries;
    }

    public User setSupports_inline_queries(boolean supports_inline_queries) {
        this.supports_inline_queries = supports_inline_queries;
        return this;
    }
}
