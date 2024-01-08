package com.example.maintenancelogbook.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="log")
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private long id;
    @Column(name="date")
    private String date;
    @Column(name="aircraft")
    private String aircraft;
    @Column(name="task")
    private String task;

}
