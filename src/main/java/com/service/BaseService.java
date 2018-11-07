package com.service;

import java.util.List;

/**
 * @author Ash
 * @date 2018/7/14 19:06
 */
public interface BaseService<T> {
    List<T> listAll();
    boolean insert(T t);
    boolean delete(Integer id);
    boolean update(T t);

}
