package org.choongang.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Data
@Entity
public class BoardData extends Base {
    @Id
    @GeneratedValue
    private Long seq;

    @Column(length = 100, nullable = false)
    private String subject;

    @Lob
    @Column(nullable = false)
    private String content;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
