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

}
