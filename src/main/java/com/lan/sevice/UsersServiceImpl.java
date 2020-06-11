package com.lan.sevice;

import com.lan.mapper.UsersMapper;
import com.lan.pojo.Users;
import com.lan.pojo.UsersExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
    public Users login(Users users) {
        Users u=usersMapper.login(users);
        return u;
    }

    public List<Users> find() {
        return usersMapper.find();
    }

    public Integer getCount() {
        return usersMapper.count();
    }

    public Integer delUserById(Integer id) {
       return usersMapper.deleteByPrimaryKey(id);
    }

    public Integer addUsers(Users users) {
        return usersMapper.insert(users);
    }

    public Integer delAllUserById(String ids) {
        return null;//usersMapper.deleteByExample(ids);
    }

    public Integer updateUsers(Users users) {
        return usersMapper.updateByPrimaryKey(users);
    }


    public List<Users> search(Users users) {
        UsersExample example=new UsersExample();
        return usersMapper.search(users);
    }
}
