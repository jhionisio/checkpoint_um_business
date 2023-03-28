package com.checkpoint.um.embedded;

import java.io.Serializable;
import java.util.List;

import com.checkpoint.um.models.Album;
import com.checkpoint.um.models.Track;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Embeddable
public class AlbumTrackId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "album_ID")
    private Album Album;

    @ManyToOne
    @JoinColumn(name = "track_ID")
    private Track Track;
}
