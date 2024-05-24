package com.cg.sm;

import java.util.List;



import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
@Service

@Transactional

public class StudentService {
	private final StudentRepository repo;
	
	public StudentService(StudentRepository studentRepository) {
        this.repo = studentRepository;
    }
	
	public List<Student> listAll()

	{  return repo.findAll();}

	public void save (Student student)
	{ 
		repo.save(student);
		}

	public Student get(Integer id) {
		return repo.findById(id).get(); 
		}

	public void delete (Integer id)
	{
		repo.deleteById(id);

	}

	}


