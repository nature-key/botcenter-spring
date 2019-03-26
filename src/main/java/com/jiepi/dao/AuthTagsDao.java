package com.jiepi.dao;

import com.jiepi.bean.AuthTags;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AuthTagsDao {

    AuthTags save(String name,String botId);

    AuthTags find(Integer id);

    List<AuthTags> findList();

    List<Integer> save(List<AuthTags> list);
}
