package com.jobBoard.job.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jobBoard.job.entity.AppliedJob;
import com.jobBoard.job.repository.AppliedJobRepository;

public class AppliedJobServiceImpl implements AppliedJobService{

	@Autowired
	AppliedJobRepository appJobRepo; 

	@Override
	public List<AppliedJob> getAllAppliedJobs() {
		return appJobRepo.findAll(); 
	}
	@Override
	public AppliedJob getAppliedJobById(Long id) {
		return appJobRepo.findById(id).orElse(null); 
	}
	@Override
	public void createAppliedJob(AppliedJob appJob) {
		appJobRepo.save(appJob); 
		
	}
	@Override
	public void updateAppliedJob(Long id, AppliedJob appJob) {
		AppliedJob existingAppJob = getAppliedJobById(id); 
//		Other properties will eventually be changed here. I'm not certain at this point what other properties we will track for this
		if(existingAppJob != null) {
			existingAppJob.setStatus(appJob.getStatus());
			appJobRepo.save(existingAppJob); 
		}
		
	}
	@Override
	public void removeAppliedJOb(Long id) {
		appJobRepo.deleteById(id);
		
	}
	
	
}
