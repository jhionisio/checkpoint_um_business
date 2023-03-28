package com.checkpoint.um.embedded;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class EmailTrackId implements Serializable {
    private String email;
    private int track_ID;
}