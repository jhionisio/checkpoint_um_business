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
@Table(name = "Customer")

public class Customer {

    @Id
    private String email;

    private String name;

    private String password;

    private int age;

    private String card_information;

    private String ip_address;

    private String device;

    @OneToMany(mappedBy = "Customer")
    private List<Purchase> Purchases;

}
