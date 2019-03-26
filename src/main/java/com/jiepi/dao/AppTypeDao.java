package com.jiepi.dao;

import com.jiepi.bean.AppType;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AppTypeDao {

    AppType save(String name, String botId);

    AppType find(Integer id);

    List<AppType> findList();

    List<Integer> save(List<AppType> list);
}
