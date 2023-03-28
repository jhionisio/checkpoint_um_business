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
@Table(name = "RecordLabel")

public class RecordLabel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int record_label_ID;

    private String record_label_name;

    private String website;

    @ManyToOne
    @JoinColumn(name = "record_label_ID")
    private Album Albums;

}
