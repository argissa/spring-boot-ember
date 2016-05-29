package com.boot.repository;

import com.boot.domain.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ArticleRepository extends CrudRepository<Article, Long> {
}