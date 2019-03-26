package com.jiepi.dao;

import com.jiepi.bean.OsType;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface OsTypeDao {

    OsType save(String name,String botId);

    OsType find(Integer id);

    List<OsType>  findList();

    List<Integer> save(List<OsType> list);
}
