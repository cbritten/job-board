package com.jobBoard.job.service;

import java.util.List;

import com.jobBoard.job.entity.Job;

public interface JobService {

	List<Job> getAllJobs(); 
	Job getJobById(Long id); 
	void createJob(Job job); 
	void updateJob(Long id, Job job); 
	void removeJob(Long id); 
}
