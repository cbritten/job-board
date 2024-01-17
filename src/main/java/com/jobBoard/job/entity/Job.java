package com.jobBoard.job.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 

@Entity
public class Job {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; 
	private String jobTitle; 
	private String jobDescription; 
	private Number salary; 
	private Number applicants; 
	private Date creationDate;
	
	public Job(Long id, String jobTitle, String jobDescription, Number salary, Number applicants, Date creationDate) {
		super();
		this.id = id;
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
		this.salary = salary;
		this.applicants = applicants;
		this.creationDate = creationDate;
	}

	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public Number getSalary() {
		return salary;
	}

	public void setSalary(Number salary) {
		this.salary = salary;
	}

	public Number getApplicants() {
		return applicants;
	}

	public void setApplicants(Number applicants) {
		this.applicants = applicants;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", jobTitle=" + jobTitle + ", jobDescription=" + jobDescription + ", salary=" + salary
				+ ", applicants=" + applicants + ", creationDate=" + creationDate + "]";
	}
	

	
}
