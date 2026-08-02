package com.ram.jai.repository;

import com.ram.jai.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student, Integer> {
}
