package com.checkpoint.um.models;

import java.util.List;

import com.checkpoint.um.embedded.AlbumTrackId;

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

    @EmbeddedId
    private AlbumTrackId albumTrackId;

    @OneToMany(mappedBy = "AlbumTracks")
    private List<Album> Album;

    @OneToMany(mappedBy = "AlbumTracks")
    private List<Track> Tracks;

}
