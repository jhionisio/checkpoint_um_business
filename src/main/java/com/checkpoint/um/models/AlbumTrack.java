package com.checkpoint.um.models;

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
@Table(name = "AlbumTrack")
public class AlbumTrack {

    @Id
    private int album_ID;

    @Id
    private int track_ID;

    @OneToMany(mappedBy = "AlbumTracks")
    private List<Album> Album;

    @OneToMany(mappedBy = "AlbumTracks")
    private List<Track> Tracks;

}
