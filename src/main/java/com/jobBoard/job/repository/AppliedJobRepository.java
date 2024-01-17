package com.jobBoard.job.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jobBoard.job.entity.AppliedJob;

public interface AppliedJobRepository extends JpaRepository<AppliedJob, Long>{

}
