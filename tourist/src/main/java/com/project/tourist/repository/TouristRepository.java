package com.project.tourist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.tourist.entity.Tourist;

public interface TouristRepository extends JpaRepository<Tourist, Integer> {

}
