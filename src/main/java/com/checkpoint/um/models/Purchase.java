package com.checkpoint.um.models;

import java.sql.Date;

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

public class Purchase {

    private int payment_method;

    private Date date;

    private double time;

    private int email;

    private int track_ID;

    @ManyToOne
    @JoinColumn(name = "email")
    private Customer Customer;

    @ManyToOne
    @JoinColumn(name = "track_ID")
    private Track Track;

}
