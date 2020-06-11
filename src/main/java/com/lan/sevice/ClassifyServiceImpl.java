package com.lan.sevice;

import com.lan.mapper.ClassifyMapper;
import com.lan.mapper.PostMapper;
import com.lan.pojo.Classify;
import com.lan.pojo.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassifyServiceImpl implements ClassifyService {
    @Autowired
    private ClassifyMapper classifyMapper;


    public List<Classify> find() {
        return classifyMapper.find();
    }

    public Integer getCount() {
        return classifyMapper.count();
    }

    public Integer delClassifyById(Integer id) {
       return classifyMapper.deleteByPrimaryKey(id);
    }

    public Integer addClassify(Classify users) {
        return classifyMapper.insert(users);
    }

    public Integer delAllUserById(String ids) {
        return null;//usersMapper.deleteByExample(ids);
    }

    public Integer updateUsers(Classify users) {
        return classifyMapper.updateByPrimaryKey(users);
    }

    public List<Classify> search(Classify users) {
        return classifyMapper.search(users);
    }
}
