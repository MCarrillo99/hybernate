package com.develhope.hybernate.entities;

import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table
@Data
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Column(nullable = false)
    private String description;

    @NotNull
    @Column(nullable = false)
    private String title;
}
