package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.cjc.main.model.Student;

public interface HomeRepository extends CrudRepository<Student, Integer>{

}
