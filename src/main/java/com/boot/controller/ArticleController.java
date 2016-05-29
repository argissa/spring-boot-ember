package com.boot.controller;

import com.boot.Converter.ArticleConverter;
import com.boot.domain.Article;
import com.boot.domain.ArticleDTO;
import com.boot.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/")
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;
    @Autowired
    private ArticleConverter converter;

    @RequestMapping(value = "articles/save", method = RequestMethod.POST)
    public ArticleDTO createArticle(@RequestBody ArticleDTO articleDTO) throws Exception {
        Article article = converter.toArticle(articleDTO);
        articleRepository.save(article);
        return converter.fromArticle(article);
    }

    @RequestMapping(value = "/articles", method = RequestMethod.GET)
    public Collection<ArticleDTO> listArticle() {
        Iterable<Article> articles = articleRepository.findAll();
        return converter.fromArticle(articles.iterator());
    }

    @RequestMapping(value = "articles/get", method = RequestMethod.GET)
    public ArticleDTO getArticle(@RequestBody ArticleDTO articleDTO) {
        Article article = articleRepository.findOne(Long.valueOf(articleDTO.getId()));
        return converter.fromArticle(article);
    }

    @RequestMapping(value = "articles/remove", method = RequestMethod.DELETE)
    public Collection<ArticleDTO> removeArticle(@RequestBody ArticleDTO articleDTO) {
        articleRepository.delete(Long.valueOf(articleDTO.getId()));
        return listArticle();
    }
    @RequestMapping(value = "/articles/{id}", method = RequestMethod.GET)
    public Article get(@PathVariable("id") Long id) {
        return articleRepository.findOne(id);
    }
}
