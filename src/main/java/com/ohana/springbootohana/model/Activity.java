package com.ohana.springbootohana.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "activities")
public class Activity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "activityname", nullable = false, length = 100)
    private String activityname;

    @Column(name = "activitypicture", nullable = false, length = 100)
    private String activitypicture;

    @Column(name = "description", nullable = false, length = 500)
    private String description;

    @Column(name= "attendant", nullable = false, length = 100)
    private String attendant;

    @Column(name= "attendantpicture", nullable = false, length = 100)
    private String attendantpicture;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false)
    private Category category;

    @Column(name = "date", nullable = false, length = 15)
    private String date;

    @Column(name = "starttime", nullable = false, length = 10)
    private String starttime;

    @Column(name = "endtime", nullable = false, length = 10)
    private String endtime;

    @Column(name="createTime", nullable = false)
    private LocalDateTime createTime;

}
