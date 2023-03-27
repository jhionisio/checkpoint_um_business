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
@Table(name = "AlbumTrack")
public class AlbumTrack {

    @Id
    private int album_ID;

    @Id
    private int track_ID;

    @ManyToOne
    @JoinColumn(name = "album_ID")
    private Album Album;

    @ManyToOne
    @JoinColumn(name = "track_ID")
    private Track Track;

}
