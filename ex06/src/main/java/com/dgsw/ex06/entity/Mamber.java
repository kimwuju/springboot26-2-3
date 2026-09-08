package com.dgsw.ex06.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mamber {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
