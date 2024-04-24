package com.example.students_in_springboot.service.implementation;

import com.example.students_in_springboot.model.News;
import com.example.students_in_springboot.repository.NewsRepository;
import com.example.students_in_springboot.service.NewsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NewsServiceImpl implements NewsService {
    private NewsRepository repository;

    @Override
    public List<News> getAllNews() {
        return repository.findAll();
    }

    @Override
    public News addNews(News news) {
        return repository.save(news);
    }

}
