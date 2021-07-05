package com.upc.plantillaservice.entity;

import com.upc.plantillaservice.model.District;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number_user")
    private String numberUser;

    private String email;

    private String password;

    private String state;

    @Transient
    private District district;

    @Column(name = "district_id")
    private Long districtId;
}
