package com.FarmSharingResourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FarmSharingResourse.model.Resource;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
