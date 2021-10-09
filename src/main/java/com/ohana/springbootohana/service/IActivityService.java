package com.ohana.springbootohana.service;

import com.ohana.springbootohana.model.Activity;

import java.util.List;

public interface IActivityService {
    Activity saveActivity(Activity activity);

    void deleteActivity(Long id);

    List<Activity> findAllActivities();
}
