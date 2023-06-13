package com.controller.dao;

import org.springframework.data.repository.CrudRepository;

import com.model.Student;

public interface StudentDAO extends CrudRepository<Student, Integer> {

}
