package com.example.demo.pg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pg.model.Article;

public interface ArticleRepository extends JpaRepository<Article, String> {

}
