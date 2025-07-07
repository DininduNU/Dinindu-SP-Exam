package com.example.sp.service;

import com.example.sp.model.News;
import com.example.sp.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsRepository {

    @Autowired
    private NewsRepository newRepository;

    public List<Category> getAllNews() {
        return newRepository.findAll();
    }

    public Optional<Category> getNewsById(Long id) {
        return newRepository.findById(id);
    }

    public News createNews(News news) {
        return newRepository.save(news);
    }

   

    public boolean deleteNews(Long id) {
        if (newRepository.existsById(id)) {
            newRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
