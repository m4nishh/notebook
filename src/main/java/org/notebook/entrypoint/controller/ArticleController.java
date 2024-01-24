package org.notebook.entrypoint.controller;

import org.notebook.dao.entity.ArticleCategoryMapping;
import org.notebook.dao.repo.ArticleCategoryMappingRepo;
import org.notebook.dao.repo.ArticleCategoryMappingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/article")
public class ArticleController {


    private ArticleCategoryMappingRepo articleCategoryMappingRepo;


    @GetMapping("/get-article")
    public ResponseEntity<?> getArticle(){
        List<ArticleCategoryMapping> articles = articleCategoryMappingRepo.findAll();
        return new ResponseEntity<List<ArticleCategoryMapping>>(articles,HttpStatus.OK);

    }

}
