package com.example.CTDCommerceProf2.service;

public interface ICommerceService<T> {
    T create(T t);
    T getById(int id);

}
