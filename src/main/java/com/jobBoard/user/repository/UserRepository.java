package com.jobBoard.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobBoard.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
