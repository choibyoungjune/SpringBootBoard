package com.byoungjune.app.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long idx;

    private String name;
    private String password;
    private String email;

    private LocalDateTime createdData;
    private LocalDateTime updateData;

    public User(String name, String password, String email, LocalDateTime createdData, LocalDateTime updateData) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.createdData = createdData;
        this.updateData = updateData;
    }
}
