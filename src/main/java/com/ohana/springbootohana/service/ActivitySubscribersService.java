package com.ohana.springbootohana.service;

import com.ohana.springbootohana.model.ActivitySubscribers;
import com.ohana.springbootohana.repository.IActivitySubscribersRepository;
import com.ohana.springbootohana.repository.projection.ISubscriptionItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ActivitySubscribersService implements IActivitySubscribersService {
    private final IActivitySubscribersRepository activitySubscribersRepository;

    public ActivitySubscribersService(IActivitySubscribersRepository activitySubscribersRepository) {
        this.activitySubscribersRepository = activitySubscribersRepository;
    }

    public ActivitySubscribers saveActivitySubscribers(ActivitySubscribers activitySubscribers) {
        activitySubscribers.setSubscribeTime(LocalDateTime.now());
        return activitySubscribersRepository.save(activitySubscribers);
    }

    @Override
    public List<ISubscriptionItem> findSubscribtionsOfUser(Long userId) {
        return activitySubscribersRepository.findAllSubscribtionsOfUser(userId);
    }
}
