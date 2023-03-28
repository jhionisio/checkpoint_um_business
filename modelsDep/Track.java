package com.checkpoint.um.models;

import java.sql.Date;
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
@Table(name = "Track")

public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int track_ID;

    private String track_name;

    private double track_length;

    private double track_size;

    private float track_price;

    private String track_language;

    private String track_producer;

    private String track_songwriters;

    private Date track_released;

    @OneToMany(mappedBy = "Track")
    private List<GenreTrack> GenreTracks;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns(value = {
            @JoinColumn(name = "album_ID", referencedColumnName = "album_ID"),
            @JoinColumn(name = "track_ID", referencedColumnName = "track_ID")
    })
    private AlbumTrack AlbumTracks;

    @OneToMany(mappedBy = "Track")
    private List<TrackArtist> TrackArtists;

    @OneToMany(mappedBy = "Track")
    private List<Purchase> Purchases;

}
