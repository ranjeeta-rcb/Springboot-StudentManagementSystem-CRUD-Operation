package com.jsp.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.student.entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
