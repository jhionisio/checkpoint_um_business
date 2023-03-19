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
@Table(name = "TrackArtist")

public class TrackArtist {

    @Id
    private int artist_ID;

    @Id
    private int track_ID;

    @ManyToOne
    @JoinColumn(name = "artist_ID")
    private Artist Artist;

    @ManyToOne
    @JoinColumn(name = "track_ID")
    private Track Track;

}
