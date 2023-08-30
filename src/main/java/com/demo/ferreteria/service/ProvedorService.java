package com.demo.ferreteria.service;

import com.demo.ferreteria.modelo.Categoria;
import com.demo.ferreteria.modelo.Provedor;
import com.demo.ferreteria.repository.ProvedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class ProvedorService implements ProvedorRepository {

    @Autowired
    private ProvedorRepository provedorRepository;
    @Override
    public List<Provedor> findAll() {
        return provedorRepository.findAll();
    }

    @Override
    public List<Provedor> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Provedor> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Provedor> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Provedor entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Provedor> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Provedor> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Provedor> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Provedor> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Provedor> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Provedor> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Provedor> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Provedor getOne(Long aLong) {
        return null;
    }

    @Override
    public Provedor getById(Long aLong) {
        return null;
    }

    @Override
    public Provedor getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Provedor> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Provedor> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Provedor> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Provedor> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Provedor> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Provedor> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Provedor, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
