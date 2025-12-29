package com.jsp.student.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.student.entity.Student;
import com.jsp.student.repository.StudentRepository;
import com.jsp.student.service.StudentService;

@Service
public class ServiceImplementation implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        List<Student> list= studentRepository.findAll();
        
        return list;
    }
    
    @Override
    public Student saveStudent(Student student) {
    	return studentRepository.save(student);
    }

	@Override
	public Student getById(int id) {
		 
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		 studentRepository.deleteById(id);
		
	}
}
