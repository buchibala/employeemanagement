package com.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Address;
import com.school.model.Message;
import com.school.model.Student;
import com.school.model.StudentObj;
import com.school.model.Subject;
import com.school.repository.AddressRepository;
import com.school.repository.StudentRepository;
import com.school.repository.SubjectRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	SubjectRepository subjectRepository;
	
	public StudentObj addStudent(StudentObj studentobj) {
		
		Address add=addressRepository.save(studentobj.getAddress());
		
		Student student =new Student(studentobj.getStudid(),studentobj.getName(),
				studentobj.getAge(),studentobj.getGender(),add);
		studentRepository.save(student);
		
		List<Subject> subjects =subjectRepository.saveAll(studentobj.getSubjects());
		
		Message msg=new Message();
		msg.setMsgcode("001");
		msg.setMessage("Student added successfully");
		StudentObj studentResponse =new StudentObj(studentobj.getStudid(),studentobj.getName(),
				studentobj.getAge(),studentobj.getGender(),add,subjects,msg);
	
	
		//student.setMsg(msg);
		return studentResponse;
	}

}
