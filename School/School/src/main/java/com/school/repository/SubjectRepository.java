package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.model.Address;
import com.school.model.Student;
import com.school.model.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {

	
}
