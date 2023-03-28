package com.checkpoint.um.embedded;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable

public class AlbumTrackId implements Serializable {
    private int album_ID;
    private int track_ID;
}
