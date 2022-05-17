package com.jobiak.bootmdb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobiak.bootmdb.model.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{

}
