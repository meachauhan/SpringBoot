package com.controller.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.model.Student;

public interface StudentDAO extends JpaRepository<Student, Integer> {

}
