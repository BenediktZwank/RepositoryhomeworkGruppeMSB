package com.example.homework7;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    public Student findByName(String name);
    public Student findByMatNr(String matNr);
    public Student findById(long Id);
}
