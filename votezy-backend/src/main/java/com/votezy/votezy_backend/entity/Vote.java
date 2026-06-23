package com.votezy.votezy_backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "VOTES")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long voterId;

    private Long candidateId;
} 