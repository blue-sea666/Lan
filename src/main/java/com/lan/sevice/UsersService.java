package com.lan.sevice;

import com.lan.pojo.Users;
import com.lan.pojo.UsersExample;

import java.util.List;
import java.util.Map;

public interface UsersService {
    public Users login(Users users);

    List<Users> find(Map<String, Object> map);

    Integer getCount();

    Integer delUserById(Integer id);

    Integer addUsers(Users users);

    Integer delAllUserById(String ids);

    Integer updateUsers(Users users);

    List<Users> search(Users users);
}
