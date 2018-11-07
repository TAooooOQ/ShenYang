package com.dao;

import java.util.List;

/**
 * @author Ash
 * @date 2018/7/14 17:12
 */
public interface BaseDao<T> {
    int update(T t);
    int delete(Integer id);
    int insert(T t);
    List<T> selectAll();
}
