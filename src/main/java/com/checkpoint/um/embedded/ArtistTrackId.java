package com.checkpoint.um.embedded;

import java.io.Serializable;

import com.checkpoint.um.models.Artist;
import com.checkpoint.um.models.Track;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ArtistTrackId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "artist_ID")
    private Artist Artist;

    @ManyToOne
    @JoinColumn(name = "track_ID")
    private Track Track;
}