package com.example.product_db_springboot.service;

import java.util.Optional;

public interface IGenerateService<T> {
    Iterable<T> getAll();
    Optional<T> getById(int id);
    T save(T t);
    void remove(Long id);
}
