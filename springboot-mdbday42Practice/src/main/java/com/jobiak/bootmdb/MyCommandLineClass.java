package com.jobiak.bootmdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jobiak.bootmdb.model.Student;
import com.jobiak.bootmdb.repo.StudentRepo;
@Component
public class MyCommandLineClass implements CommandLineRunner {

	
	
	@Autowired
	StudentRepo repo;
	
	
	@Override
	public void run(String... args) throws Exception {
		Student s1=new Student();
		s1.setRollNo(30L);
		s1.setName("Meghana");
		s1.setBranch("ECE");
		Student s2=new Student();
		s2.setRollNo(31L);
		s2.setName("Maduri");
		s2.setBranch("CSE");
		Student s3=new Student();
		s3.setRollNo(32L);
		s3.setName("Ramani");
		s3.setBranch("IT");
		
		repo.save(s1);
		repo.save(s2);
		repo.save(s3);
		
		List<Student>list =repo.findAll();
		 for(Student s:list) {
			 System.out.println(s);
		 }
	}

}
