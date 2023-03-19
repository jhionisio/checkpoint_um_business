package com.checkpoint.um.models;

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
@Table(name = "GenreTrack")

public class GenreTrack {

    @Id
    private int genre_ID;

    @Id
    private int track_ID;

    @ManyToOne
    @JoinColumn(name = "genre_ID")
    private Genre Genre;

    @ManyToOne
    @JoinColumn(name = "track_ID")
    private Track Track;

}
