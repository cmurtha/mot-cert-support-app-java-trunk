package e2e;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonProperty;

public class AuthPayload {

    @JsonProperty
    private String email;
    @JsonProperty
    private String password;

    public AuthPayload(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}