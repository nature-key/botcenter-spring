package com.jiepi.dao;

import com.jiepi.bean.AuthTags;

import java.util.List;

public interface AuthTagsDao {

    AuthTags save(String name,String botId);

    AuthTags find(Integer id);

    List<AuthTags> findList();

    Integer save(List<AuthTags> list);
}
