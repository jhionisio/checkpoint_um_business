package com.checkpoint.um.embedded;

import java.io.Serializable;

import com.checkpoint.um.models.Customer;
import com.checkpoint.um.models.Track;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class EmailTrackId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "email")
    private Customer Customer;

    @ManyToOne
    @JoinColumn(name = "track_ID")
    private Track Track;
}