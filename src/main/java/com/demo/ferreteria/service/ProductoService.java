package com.demo.ferreteria.service;

import com.demo.ferreteria.modelo.Producto;
import com.demo.ferreteria.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class ProductoService implements ProductoRepository {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> findAllByIdCategoria(Long idCategoria){
        List<Producto> AllProductos, AllProductosByCategoria = new ArrayList();
        AllProductos=productoRepository.findAll();
        try {
            for(Producto p : AllProductos){
                if(p.getCategoria().getId()==idCategoria){
                    AllProductosByCategoria.add(p);
                }
            }
            return AllProductosByCategoria;

        }catch (Exception e){
            return AllProductosByCategoria;

        }

    }
    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public List<Producto> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Producto> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Producto> findAllById(Iterable<Long> longs) {
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
    public void delete(Producto entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Producto> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Producto> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Producto> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return productoRepository.findById(id);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Producto> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Producto> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Producto> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Producto getOne(Long id) {
        return productoRepository.getOne(id);
    }

    @Override
    public Producto getById(Long id) {
        System.out.println("*********SERVICE::getReferenceById**************");
        System.out.println("llega "+id);
        return productoRepository.getById(id);
    }

    @Override
    public Producto getReferenceById(Long id) {
        return null;
    }

    @Override
    public <S extends Producto> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Producto> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Producto> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Producto> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Producto> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Producto> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Producto, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
