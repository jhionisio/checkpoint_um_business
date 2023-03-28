package com.checkpoint.um.models;

import com.checkpoint.um.embedded.ArtistTrackId;

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

    @EmbeddedId
    private ArtistTrackId artistTrackId;

}
