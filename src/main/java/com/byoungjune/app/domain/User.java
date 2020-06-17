package com.byoungjune.app.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long idx;

    private String name;
    private String password;
    private String email;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}