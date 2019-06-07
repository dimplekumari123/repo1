package com.example;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootWithHybernete.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
