package ch.nyp.xinnyi.bot.api.dtos;

import ch.nyp.xinnyi.core.ExtendedDTO;

public class Credentials implements ExtendedDTO {

    private String email;
    private String password;

    public Credentials(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public Credentials setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Credentials setPassword(String password) {
        this.password = password;
        return this;
    }
}
