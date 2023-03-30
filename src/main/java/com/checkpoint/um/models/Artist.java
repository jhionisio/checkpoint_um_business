package com.checkpoint.um.models;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Artist")

public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int artist_ID;

    private String artist_name;

    private int artist_type;

}
