package com.ohana.springbootohana.service;


import com.ohana.springbootohana.model.Activity;
import com.ohana.springbootohana.repository.IActivityRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ActivityService implements IActivityService {

    private final IActivityRepository activityRepository;

    public ActivityService(IActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @Override
    public Activity saveActivity(Activity activity) {
        activity.setCreateTime(LocalDateTime.now());
        return activityRepository.save(activity);
    }

    @Override
    public void deleteActivity(Long id) {
        activityRepository.deleteById(id);
    }

    @Override
    public List<Activity> findAllActivities() {
        return activityRepository.findAll();
    }
}
