package com.example.students_in_springboot.controller;

import com.example.students_in_springboot.model.News;
import com.example.students_in_springboot.service.NewsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/news")
@AllArgsConstructor
public class NewsController {
    private final NewsService service;

    @GetMapping
    public List<News> getAllNews() { return service.getAllNews(); }

    @PostMapping("/create_news")
    public News addNews(@RequestBody News news) {
        return service.addNews(news);
    }
}
