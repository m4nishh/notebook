package org.notebook.dao.repo;

import org.notebook.dao.entity.ArticleCategoryMapping;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ArticleCategoryMappingRepo implements IArticleCategoryMappingRepo{
    @Override
    public <S extends ArticleCategoryMapping> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends ArticleCategoryMapping> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends ArticleCategoryMapping> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends ArticleCategoryMapping> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends ArticleCategoryMapping> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends ArticleCategoryMapping> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ArticleCategoryMapping> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends ArticleCategoryMapping> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends ArticleCategoryMapping, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends ArticleCategoryMapping> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ArticleCategoryMapping> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ArticleCategoryMapping> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<ArticleCategoryMapping> findAll() {
        return null;
    }

    @Override
    public List<ArticleCategoryMapping> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(ArticleCategoryMapping entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends ArticleCategoryMapping> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<ArticleCategoryMapping> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<ArticleCategoryMapping> findAll(Pageable pageable) {
        return null;
    }
}
