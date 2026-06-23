package com.votezy.votezy_backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "CANDIDATES")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String party;
}