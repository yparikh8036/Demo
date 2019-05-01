package com.example.demo.repository;

import com.example.demo.domain.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends JpaRepository<Demo,Long> {
}
