package com.ohana.springbootohana.repository;

import com.ohana.springbootohana.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository <Activity, Long>
{

}
