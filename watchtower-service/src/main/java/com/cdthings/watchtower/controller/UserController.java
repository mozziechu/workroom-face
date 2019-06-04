package com.cdthings.watchtower.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cdthings.watchtower.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

	@Autowired
    private UserDao userDao;

	@RequestMapping(value = "/findUser")
    public JSONObject findUser() {
        return userDao.findUser();
    }

    @RequestMapping(value = "/findUserByUserAccountAndPassword")
    public JSONObject findUserByUserAccountAndPassword(String userAccount, String password) {
        return userDao.findUserByUserAccountAndPassword(userAccount,password);
    }

    @RequestMapping(value = "/findClass")
    public List<Object> findClass() {
        return userDao.findClass();
    }

}
