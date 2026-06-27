package com.cognizant.orm_learn.repository;

import com.cognizant.orm_learn.model.Country;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //marks this as spring repository
//JpaRepository<Entiry,PrimaryKey type>
public interface CountryRepository extends JpaRepository<Country, String> {
    // - save(entity) → INSERT or UPDATE
    // - findById(id) → SELECT by primary key
    // - findAll() → SELECT all records
    // - deleteById(id) → DELETE by primary key
    // - count() → COUNT records
    // - existsById(id) → Check if record exists
}
