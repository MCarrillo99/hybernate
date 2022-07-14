package com.develhope.hybernate.entities;

import com.develhope.hybernate.entities.Classes;
import com.develhope.hybernate.entities.Student;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Table
@Entity
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    public Student students;

    @ManyToOne
    public Classes classes;

}
