package com.checkpoint.um.embedded;

import java.io.Serializable;

import com.checkpoint.um.models.Genre;
import com.checkpoint.um.models.Track;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class GenreTrackId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "genre_ID", referencedColumnName = "genre_ID")
    private Genre Genres;

    @ManyToOne
    @JoinColumn(name = "track_ID", referencedColumnName = "track_ID")
    private Track Tracks;
}