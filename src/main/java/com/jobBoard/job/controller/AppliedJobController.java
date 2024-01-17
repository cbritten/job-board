package com.jobBoard.job.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobBoard.job.entity.AppliedJob;
import com.jobBoard.job.service.AppliedJobService;

@RestController
@RequestMapping("/appliedJobs")
public class AppliedJobController {
	private AppliedJobService appJobServ;

	@GetMapping
	public List<AppliedJob> getAllAppliedJobs() {
		return appJobServ.getAllAppliedJobs();
	}
	@GetMapping("/{id}")
	public AppliedJob getAppliedJobById(@PathVariable Long id) {
		return appJobServ.getAppliedJobById(id);
	}
	@PostMapping
	public void createAppliedJob(@RequestBody AppliedJob appJob) {
		appJobServ.createAppliedJob(appJob);
	}
	@PutMapping
	public void updateAppliedJob(@PathVariable Long id, @RequestBody AppliedJob appJob) {
		appJobServ.updateAppliedJob(id, appJob);
	}
	@DeleteMapping("/{id}")
	public void removeAppliedJOb(@PathVariable Long id) {
		appJobServ.removeAppliedJOb(id);
	} 
	
	

}
