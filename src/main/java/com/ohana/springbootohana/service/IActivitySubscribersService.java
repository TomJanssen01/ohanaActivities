package com.ohana.springbootohana.service;

import com.ohana.springbootohana.repository.projection.ISubscriptionItem;

import java.util.List;

public interface IActivitySubscribersService {
    List<ISubscriptionItem> findSubscribtionsOfUser(Long userId);
}
