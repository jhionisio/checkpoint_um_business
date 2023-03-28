package com.checkpoint.um.models;

import java.sql.Date;

import com.checkpoint.um.embedded.EmailTrackId;

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
@Table(name = "Purchase")

public class Purchase {

    private int payment_method;

    private Date date;

    private double time;

    @EmbeddedId
    private EmailTrackId emailTrackId;

}
