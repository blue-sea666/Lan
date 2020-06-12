package com.lan.sevice;

import com.lan.mapper.PostMapper;
import com.lan.mapper.UsersMapper;
import com.lan.pojo.Post;
import com.lan.pojo.Users;
import com.lan.pojo.UsersExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostMapper postMapper;


    public List<Post> find() {
        return postMapper.find();
    }

    public Integer getCount() {
        return postMapper.count();
    }

    public Integer delPostById(Integer id) {
       return postMapper.deleteByPrimaryKey(id);
    }

    public Integer addPost(Post users) {
        return postMapper.insert(users);
    }

    public Integer delAllUserById(String ids) {
        return null;//usersMapper.deleteByExample(ids);
    }

    public Integer updatePost(Post users) {
        return postMapper.updateByPrimaryKey(users);
    }


    public List<Post> search(Post users) {
        return postMapper.search(users);
    }
}
