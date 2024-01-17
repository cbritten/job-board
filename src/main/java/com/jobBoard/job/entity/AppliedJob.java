package com.jobBoard.job.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AppliedJob {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; 
	private Long userId; 
	private Long jobId; 
	private String status;
	public AppliedJob() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppliedJob(Long id, Long userId, Long jobId, String status) {
		super();
		this.id = id;
		this.userId = userId;
		this.jobId = jobId;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getJobId() {
		return jobId;
	}
	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "AppliedJob [id=" + id + ", userId=" + userId + ", jobId=" + jobId + ", status=" + status + "]";
	} 

	
}
