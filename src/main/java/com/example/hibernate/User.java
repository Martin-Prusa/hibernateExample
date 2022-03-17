package com.example.hibernate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

public class User {

    @Email
    private String email;

    @NotNull
    @NotBlank
    @NotEmpty
    private String name;

    private UUID id;

    public User() {
        id = UUID.randomUUID();
    }

    public User(String email, String name) {
        this.email = email;
        this.name = name;
        id = UUID.randomUUID();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
