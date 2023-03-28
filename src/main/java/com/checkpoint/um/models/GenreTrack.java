package com.checkpoint.um.models;

import com.checkpoint.um.embedded.GenreTrackId;

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

    @EmbeddedId
    private GenreTrackId genreTrackId;

    @ManyToOne
    @JoinColumn(name = "genre_ID")
    private Genre Genre;

    @ManyToOne
    @JoinColumn(name = "track_ID")
    private Track Track;

}
