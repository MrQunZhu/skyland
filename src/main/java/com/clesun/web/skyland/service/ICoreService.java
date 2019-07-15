package com.clesun.web.skyland.service;



import com.clesun.web.skyland.exception.ServiceException;

import java.util.List;

/**
 * Created by clesun on 2017/5/17.
 */
public interface ICoreService<T,K>{
    T getById(K id) throws ServiceException;
    List<T> findAll() throws ServiceException;
    int deleteById(K id) throws ServiceException;

    int insert(T o) throws ServiceException;
    int update(T o) throws ServiceException;

}
