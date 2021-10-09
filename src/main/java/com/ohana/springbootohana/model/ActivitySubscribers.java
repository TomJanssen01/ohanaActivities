package com.ohana.springbootohana.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="activity_subscribers")
public class ActivitySubscribers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="user_id", nullable = false)
    private Long userId;

    @Column(name="activity_id", nullable = false)
    private Long activityId;

    @Column(name = "subscribe_time", nullable = false)
    private LocalDateTime subscribeTime;

}
