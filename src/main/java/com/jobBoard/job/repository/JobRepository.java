package com.jobBoard.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobBoard.job.entity.Job;

public interface JobRepository extends JpaRepository<Job, Long>{

}
