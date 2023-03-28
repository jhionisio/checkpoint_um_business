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
@Table(name = "Album")

public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int album_ID;

    private String album_name;

    private int album_type;

    private Date album_released;

    private Date album_recorded;

    private int artist_ID;

    private int record_label_ID;

    @ManyToOne
    @JoinColumn(name = "artist_ID")
    private Artist Artist;

    @ManyToOne
    @JoinColumn(name = "record_label_ID")
    private RecordLabel RecordLabel;

    @ManyToOne
    @JoinColumn(name = "album_ID")
    private AlbumTrack albumTrackId;

}
