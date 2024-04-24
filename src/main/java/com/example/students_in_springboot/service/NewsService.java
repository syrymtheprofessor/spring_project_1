package com.example.students_in_springboot.service;

import com.example.students_in_springboot.model.News;

import java.util.List;

public interface NewsService {
    List<News> getAllNews();
    News addNews(News news);
}
