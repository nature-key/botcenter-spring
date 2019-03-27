package com.jiepi.dao;

import com.jiepi.bean.OsType;

import java.util.List;

public interface OsTypeDao {

    OsType save(String name,String botId);

    OsType find(Integer id);

    List<OsType>  findList();

    Integer save(List<OsType> list);
}
