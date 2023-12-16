package com.example.MedTech.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ADMIN,
    MANAGER,
    CLIENT;

    @Override
    public String getAuthority() {
        return name();
    }
}
