package com.ohana.springbootohana.repository.projection;

import java.time.LocalDateTime;

public interface ISubscriptionItem
{
    String getActivityname();
    String getDate();
    LocalDateTime getSubscribeTime();
}
