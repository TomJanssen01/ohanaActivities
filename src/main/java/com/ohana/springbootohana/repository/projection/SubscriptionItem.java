package com.ohana.springbootohana.repository.projection;

import java.time.LocalDateTime;

public interface SubscriptionItem
{
    String getActivityname();
    String getDate();
    LocalDateTime getSubscribeTime();
}
