package com.develhope.hybernate.entities;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.Tables;

import javax.persistence.*;

@Entity
@Data
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Column(nullable = false)
    private String lastName;

    @NotNull
    @Column(nullable = false)
    private String firstName;
    private String email;
}
