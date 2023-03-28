package com.checkpoint.um.embedded;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class GenreTrackId implements Serializable {
    private int genre_ID;
    private int track_ID;
}