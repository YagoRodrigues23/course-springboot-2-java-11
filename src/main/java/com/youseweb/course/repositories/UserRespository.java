package com.youseweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youseweb.course.entities.User;

public interface UserRespository extends JpaRepository<User, Long>{

}
