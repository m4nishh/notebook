package org.notebook.dao.repo;

import org.notebook.dao.entity.Logins;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface ILoginsRepo extends MongoRepository<Logins, String> {
    @Override
    <S extends Logins> S insert(S entity);

    @Override
    <S extends Logins> List<S> insert(Iterable<S> entities);

    @Override
    <S extends Logins> List<S> findAll(Example<S> example);

    @Override
    <S extends Logins> List<S> findAll(Example<S> example, Sort sort);

    @Override
    <S extends Logins> List<S> saveAll(Iterable<S> entities);

    @Override
    List<Logins> findAll();

    @Override
    List<Logins> findAllById(Iterable<String> strings);

    @Override
    <S extends Logins> S save(S entity);

    @Override
    Optional<Logins> findById(String s);

    @Override
    boolean existsById(String s);

    @Override
    long count();

    @Override
    void deleteById(String s);

    @Override
    void delete(Logins entity);

    @Override
    void deleteAllById(Iterable<? extends String> strings);

    @Override
    void deleteAll(Iterable<? extends Logins> entities);

    @Override
    void deleteAll();

    @Override
    List<Logins> findAll(Sort sort);

    @Override
    Page<Logins> findAll(Pageable pageable);

    @Override
    <S extends Logins> Optional<S> findOne(Example<S> example);

    @Override
    <S extends Logins> Page<S> findAll(Example<S> example, Pageable pageable);

    @Override
    <S extends Logins> long count(Example<S> example);

    @Override
    <S extends Logins> boolean exists(Example<S> example);

    @Override
    <S extends Logins, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);

    public Logins findByEmail(String email);
}
