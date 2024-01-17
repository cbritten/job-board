package com.jobBoard.job.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobBoard.job.entity.Job;
import com.jobBoard.job.repository.JobRepository;


@Service
@Transactional
public class JobServiceImpl implements JobService{

	@Autowired 
	private JobRepository jobRepo; 
	
	@Override
	public List<Job> getAllJobs() {
		return jobRepo.findAll(); 
	}
	
	@Override
	public Job getJobById(Long id) {
		return jobRepo.findById(id).orElse(null); 
	}
	@Override
	public void createJob(Job job) {
		jobRepo.save(job); 
	}
	@Override
	public void updateJob(Long id, Job job) {
		Job existingJob = getJobById(id); 
		if(existingJob != null) {
			existingJob.setJobTitle(job.getJobTitle());
			existingJob.setJobDescription(job.getJobDescription());
			existingJob.setSalary(job.getSalary());
			existingJob.setApplicants(job.getApplicants());
			existingJob.setCreationDate(job.getCreationDate());
			jobRepo.save(existingJob); 
		}
	}
	@Override
	public void removeJob(Long id) {
		jobRepo.deleteById(id);
		
	}
	
}
