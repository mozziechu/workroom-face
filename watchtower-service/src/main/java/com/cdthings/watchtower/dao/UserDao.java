package com.cdthings.watchtower.dao;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("select * from cd_subscriber_primary where user_account = #{userAccount} and password = #{password}")
    JSONObject findUserByUserAccountAndPassword(String userAccount, String password);

    @Select("select * from cd_subscriber_primary")
    JSONObject findUser();

    @Select("select * from classinfo")
    List<Object> findClass();
}
