package com.jobBoard.job.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobBoard.job.entity.Job;
import com.jobBoard.job.service.JobService;

@RestController
@RequestMapping("/jobs")
public class JobController {
	
	@Autowired
	private JobService jobService; 

	@GetMapping
	public List<Job> getAllJobs() {
		return jobService.getAllJobs();
	}
	@GetMapping("/{id}")
	public Job getJobById(@PathVariable Long id) {
		return jobService.getJobById(id);
	}
	@PostMapping
	public void createJob(@RequestBody Job job) {
		jobService.createJob(job);
	}
	@PutMapping
	public void updateJob(@PathVariable Long id,@RequestBody Job job) {
		jobService.updateJob(id, job);
	}
	@DeleteMapping("/{id")
	public void removeJob(@PathVariable Long id) {
		jobService.removeJob(id);
	}
}
