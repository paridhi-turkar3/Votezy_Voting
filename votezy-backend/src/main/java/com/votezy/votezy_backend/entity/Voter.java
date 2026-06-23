package com.votezy.votezy_backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "VOTERS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Voter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;
}