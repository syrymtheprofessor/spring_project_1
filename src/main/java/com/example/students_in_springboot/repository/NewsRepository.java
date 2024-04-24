package com.example.students_in_springboot.repository;

import com.example.students_in_springboot.model.News;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NewsRepository extends JpaRepository<News, Long> {

}
