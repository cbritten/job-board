package com.jobBoard.job.service;

import java.util.List;

import com.jobBoard.job.entity.AppliedJob;

public interface AppliedJobService {

	List<AppliedJob> getAllAppliedJobs(); 
	AppliedJob getAppliedJobById(Long id); 
	void createAppliedJob(AppliedJob appJob); 
	void updateAppliedJob(Long id, AppliedJob appJob); 
	void removeAppliedJOb(Long id); 
}
