package com.checkpoint.um.embedded;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class ArtistTrackId implements Serializable {
    private int artist_ID;
    private int track_ID;
}