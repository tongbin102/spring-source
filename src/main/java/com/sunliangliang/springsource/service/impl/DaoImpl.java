package com.sunliangliang.springsource.service.impl;

import com.sunliangliang.springsource.service.Dao;

/**
 * created by sunliangliang
 */
public class DaoImpl implements Dao{
    @Override
    public void select() {
        System.out.println("Enter DaoImpl.select()");
    }

    @Override
    public void insert() {
        System.out.println("Enter DaoImpl.insert()");
    }
}
