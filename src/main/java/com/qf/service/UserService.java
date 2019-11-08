package com.qf.service;

import com.qf.pojo.User;

import java.util.List;

public interface UserService {
    public String getUpwdByUname(String uname);

    public String getRoleByUname(String uname);

    public int saveUser(User user);

    public int deleteUser(int uid);

    public int updateUser(User user);

    public User getUserByUid(int uid);

    public List<User> getUserList();

}
