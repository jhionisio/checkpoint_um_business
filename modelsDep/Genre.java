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
@Table(name = "Genre")

public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int genre_ID;

    private String genre_name;

    @OneToMany(mappedBy = "Genre")
    private List<GenreTrack> GenreTracks;

}
