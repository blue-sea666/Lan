package com.lan.mapper;

import com.lan.pojo.Users;
import com.lan.pojo.UsersExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    int countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    Users login(Users users);

    List<Users> find(Map<String, Object> map);

    Integer count();

    List<Users> search(Users users);
}