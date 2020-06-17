package com.byoungjune.app.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString(exclude = "user")
public class Board {
    @Id
    @GeneratedValue
    private Long idx;

    private String title;
    private String subTitle;
    private String content;

    @Enumerated(EnumType.STRING)
    private BoardType boardType;

    private LocalDateTime createdDate;
    private LocalDateTime updateDate;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;
}