package com.gdsc.webboard.user;

import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN("ROLE_ADMIN"),
    USER("ROLEUSER");

    UserRole(String value) {
        this.value = value;
    }

    private String value;
}
