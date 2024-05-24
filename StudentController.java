package com.cg.sm;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework. web.bind.annotation.*;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	//restful API method for retrieval operation
	@GetMapping("/student")
	public List<Student>list()
	{
		return service.listAll();
	}
	//create
	@GetMapping("/student/{id}")
	public ResponseEntity<Student>get(@PathVariable Integer id)
	{
		try {
			Student student=service.get(id);
			return new ResponseEntity<Student>(student,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
	//post
	@PostMapping("/student")
	public void add(@RequestBody Student student)
	{
		service.save(student);
	}
	
	@PutMapping("/student/{id}")
	public ResponseEntity<?>update(@RequestBody Student student, @PathVariable Integer id)
	{
		try {

			Student existStudent=service.get(id);
			service.save(student);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/student/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
}


	