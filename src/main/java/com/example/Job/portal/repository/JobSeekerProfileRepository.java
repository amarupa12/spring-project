package com.example.Job.portal.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Job.portal.entity.JobSeekerProfile;

public interface JobSeekerProfileRepository extends JpaRepository<JobSeekerProfile, Integer> {
}