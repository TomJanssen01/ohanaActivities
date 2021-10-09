package com.ohana.springbootohana.repository;

import com.ohana.springbootohana.model.ActivitySubscribers;
import com.ohana.springbootohana.repository.projection.SubscriptionItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ActivitySubscribersRepository extends JpaRepository<ActivitySubscribers, Long> {
    @Query("select " +
            "a.activityname as name, a.date as date, ac.subscribeTime as subscribeTime " +
            "from ActivitySubscribers ac left join Activity a on a.id = ac.activityId " +
            "where ac.userId = :userId")
    List<SubscriptionItem> findAllSubscribtionsOfUser(@Param("userId") Long userId);
}
